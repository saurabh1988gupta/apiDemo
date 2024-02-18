FROM openjdk:17
EXPOSE 8080
ADD target/api-demo.jar api-demo.jar
ENTRYPOINT ["java", "-jar", "/api-demo.jar"]