FROM openjdk:17
EXPOSE 8080
ADD target/soccerapi.jar soccerapi.jar
ENTRYPOINT ["java", "-jar", "/soccerapi.jar"]