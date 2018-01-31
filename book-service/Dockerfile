FROM java:8-jre
VOLUME /tmp
ARG JAR_FILE=./target/book-service.jar
ADD ${JAR_FILE} app.jar
EXPOSE 8083
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]