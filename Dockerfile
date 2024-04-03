# Use an official OpenJDK runtime as a base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY target/docker-0.0.1-SNAPSHOT.jar /app/docker-0.0.1-SNAPSHOT.jar

# Expose the port that your Spring Boot application listens on (default is 8080)
EXPOSE 8080

# Specify the command to run your Spring Boot application when the container starts
CMD ["java", "-jar", "docker-0.0.1-SNAPSHOT.jar"]
