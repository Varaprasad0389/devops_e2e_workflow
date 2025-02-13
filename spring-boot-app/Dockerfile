# Use AdoptOpenJDK base image with Java 11
FROM adoptopenjdk/openjdk11:alpine-jre

# Set the working directory
WORKDIR /opt/app

# Copy the JAR file built by Maven
ARG JAR_FILE=target/spring-boot-demo-1.0.jar
COPY ${JAR_FILE} app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
