FROM openjdk:11
EXPOSE 9098
ADD target/jenkins-integration-0.0.1-SNAPSHOT.jar jenkins-integration.jar
ENTRYPOINT ["java","-jar","/jenkins-integration.jar"]