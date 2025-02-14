# Use AdoptOpenJDK base image with Java 11
FROM adoptopenjdk/openjdk11:alpine-jre

# Set the working directory
WORKDIR /opt/app

# Ensure the JAR file path matches the Maven output
ARG JAR_FILE=target/spring-boot-demo-1.0.jar
COPY ${JAR_FILE} app.jar

# Ensure Dockerfile is present in the correct path
# Place this Dockerfile in the root of your project

# Expose the application on port 80
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
