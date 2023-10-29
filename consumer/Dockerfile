FROM maven:3.9.1-amazoncorretto-11 AS build

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

COPY . /app
RUN mvn package

FROM openjdk:11-jre

COPY --from=build /app/target/consumer-1.0-SNAPSHOT.jar /app/consumer.jar

WORKDIR /app

CMD ["java", "-jar", "consumer.jar"]
