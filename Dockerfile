# syntax=docker/dockerfile:1

FROM tomcat:9.0.62
LABEL maintainer='olga.a.grigorieva@gmail.com'
ADD ./target/restfulSpring.war /usr/local/tomcat/webapps/
EXPOSE 8080
CMD ["catalina.sh", "run"]