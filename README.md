# Starter Template For JSF Project

This is a basic starter template for JSF Project with Maven and IntelliJ.
In this ``Authentication`` Branch, i added authentication, if you want to use it you can work on this branch or merge this branch on the Master Branch.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

I hightly recommend you for running this project :
- IntelliJ Idea (IDE), you can get a free copy [here](https://www.jetbrains.com/idea/download)
- [Git](https://git-scm.com/)
### Installing

Clone or fork this Project and open it in IntelliJ

```
git clone https://github.com/WilChrist/JSF_STARTER_PROJECT_TEMPLATE.git
```

Edit launch configuration in IntelliJ and add an Artifact of type ``Web Application : Exploded`` (From Module)
If you use just a web container like Apache Tomcat, you must uncomment this on Pom.xml

```xml
        <!--<dependency>
            <groupId>com.sun.faces</groupId>
            <artifactId>jsf-impl</artifactId>
            <version>2.2.2</version>
        </dependency>-->
```

## Deployment

For deploying this app, i recommend you to use [JBoss EAP](https://developers.redhat.com/products/eap/download/)

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Materializecss](https://materializecss.com/getting-started.html) - Open Source toolkit for (mobile-style) styling web site
* [Db4o](https://en.wikipedia.org/wiki/Db4o) Object Oriented Database

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [Git](https://git-scm.com/) for versioning.

## Authors

* **Willy Nzesseu** - *Initial work* - [WilChrist](https://github.com/WilChrist)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Inspiration
* etc
