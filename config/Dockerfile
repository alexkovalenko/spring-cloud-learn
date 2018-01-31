FROM java:8-jre
VOLUME /tmp
ARG JAR_FILE=./target/config.jar
ADD ${JAR_FILE} app.jar

CMD ["java", "-Dspring.profiles.active=docker", "-Xmx200m", "-jar", "/app.jar"]

HEALTHCHECK --interval=10s --timeout=3s --retries=20 CMD curl -f http://localhost:8081/health || exit 1

EXPOSE 8081