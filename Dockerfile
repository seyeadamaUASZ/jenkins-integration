FROM openjdk:11
EXPOSE 9098
ADD target/jenkins-integration.jar jenkins-integration.jar
ENTRYPOINT ["java","-jar","/jenkins-integration.jar"]