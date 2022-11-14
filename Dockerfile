FROM openjdk:11
ADD target/PropertiesService.jar PropertiesService.jar
EXPOSE 9000
ENTRYPOINT ["java", "-jar", "PropertiesService.jar"]