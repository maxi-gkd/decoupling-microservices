FROM maven:3.9.1-amazoncorretto-11 AS build

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

RUN mvn package

FROM amazoncorretto:11-alpine3.15

COPY --from=build /app/target/consumer-1.0-SNAPSHOT.jar /app/consumer.jar

WORKDIR /app

CMD ["java", "-jar", "consumer.jar"]
