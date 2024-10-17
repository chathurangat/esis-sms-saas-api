FROM openjdk:19
LABEL maintainer="shanaka@gmail.com"
WORKDIR /app
COPY target/vehicle-service.jar /app/vehicle-service.jar
ENTRYPOINT ["java","-jar","vehicle-service.jar"]