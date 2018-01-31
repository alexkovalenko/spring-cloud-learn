FROM java:8-jre
VOLUME /tmp
ARG JAR_FILE=./target/discovery.jar
ADD ${JAR_FILE} app.jar
EXPOSE 8082
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
HEALTHCHECK --interval=10s --timeout=3s --retries=20 CMD curl -f http://localhost:8082/health || exit 1