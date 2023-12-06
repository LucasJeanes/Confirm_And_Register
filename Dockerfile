# I used Java 20 in this IntelliJ so use openJDK 20 in the docker
FROM openjdk:20

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the target directory to the container at /app
COPY target/Confirm_And_Register-0.0.1-SNAPSHOT.jar /app

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the JAR file when the container launches
CMD ["java", "-jar", "Confirm_And_Register-0.0.1-SNAPSHOT.jar","--spring.profiles.active=docker"]