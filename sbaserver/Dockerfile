FROM openjdk:13-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} sbaserver.jar
ENTRYPOINT ["java","-jar","/sbaserver.jar"]