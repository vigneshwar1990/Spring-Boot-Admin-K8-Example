FROM openjdk:13-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} orderservice.jar
ENTRYPOINT ["java","-jar","/orderservice.jar"]