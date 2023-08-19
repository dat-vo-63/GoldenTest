FROM maven:3.8.5-openjdk-17-slim AS build
COPY . .
RUN     mvn clean verify

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/Golden-shoes.jar Golden-shoes.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","Golden-shoes.jar"]