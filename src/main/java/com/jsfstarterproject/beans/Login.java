package com.jsfstarterproject.beans;

import com.jsfstarterproject.models.User;
import com.jsfstarterproject.util.SessionUtils;
import com.jsfstarterproject.dao.LoginDao;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

@ManagedBean
@SessionScoped
public class Login implements Serializable {

    private static final long serialVersionUID = 1094801825228386363L;

    @ManagedProperty(name="user",value="#{user}")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @PostConstruct
    private void init(){
        user=new User();
    }
    //validate login
    public String validateEmailPassword() {
        boolean valid = LoginDao.validate(user.getEmail(), user.getPassword());
        if (valid) {
            HttpSession session = SessionUtils.getSession();
            session.setAttribute("user.email", user.getEmail());
            session.setAttribute("myuser", LoginDao.getUser(user.getEmail(), user.getPassword()));
            return "member";
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd",
                            "Please enter correct username and Password"));
            return "login";
        }
    }

    //logout event, invalidate session
    public String logout() {
        HttpSession session = SessionUtils.getSession();
        session.invalidate();
        return "login";
    }
}
