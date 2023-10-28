FROM maven:3.8.4-openjdk-11 AS build

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

RUN mvn package

FROM openjdk:11-jre

COPY --from=build /app/target/producer-1.0-SNAPSHOT.jar /app/producer.jar

WORKDIR /app

CMD ["java", "-jar", "producer.jar"]