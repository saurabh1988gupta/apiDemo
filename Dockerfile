FROM openjdk:17
EXPOSE 8080
ADD target/API-Demo.jar API-Demo.jar
ENTRYPOINT ["java", "-jar", "/API-Demo.jar"]