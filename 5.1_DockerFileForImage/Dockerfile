FROM openjdk:24-slim-bullseye
ADD target/Rest-Dockerjar.jar Rest-Dockerjar.jar
ENTRYPOINT ["java","-jar","/Rest-Dockerjar.jar"]