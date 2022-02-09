FROM openjdk:8-jdk-alpine
ADD target/Jenkins-0.0.1-SNAPSHOT.jar jenkins-docker.jar
ENTRYPOINT ["java","-jar","jenkins-docker.jar"]