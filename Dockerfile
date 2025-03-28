FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/todos.jar todos.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "todos.jar"]
