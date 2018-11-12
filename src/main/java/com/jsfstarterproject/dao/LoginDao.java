package com.jsfstarterproject.dao;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.jsfstarterproject.models.Role;
import com.jsfstarterproject.models.User;

import java.util.Date;

public class LoginDao {
    public static boolean validate(String email, String password) {
        ObjectContainer db = Db4oEmbedded.openFile("OODataBase.data");

        try {
            ObjectSet<User> users = db.queryByExample(User.class);
            if (users.isEmpty()) {
                db.store(new User(1, "Nzesseu", "Willy", "willynzesseu@gmail.com", "12345", new Date(), new Role(1, "Member", "A Registred User")));
                db.commit();
                return false;
            } else {
                for (User u : users) {
                    if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
                        return true;
                    }
                }
                return false;
            }


        } finally {
            db.close();
        }
    }

    public static User getUser(String email, String password) {
        ObjectContainer db = Db4oEmbedded.openFile("OODataBase.data");

        try {
            ObjectSet<User> users = db.queryByExample(User.class);
            for (User u : users) {
                if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
                    return u;
                }
            }

        } finally {
            db.close();
        }
        return null;
    }
}
