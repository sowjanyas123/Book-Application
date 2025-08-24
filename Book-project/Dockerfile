FROM openjdk:21
WORKDIR /app

# Copy the JAR file from target folder into container and rename to app.jar
COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
