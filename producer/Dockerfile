FROM maven:3.9.1-amazoncorretto-11 AS build

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline

RUN mvn package

FROM amazoncorretto:11-alpine3.15

COPY --from=build /app/target/producer-1.0-SNAPSHOT.jar /app/producer.jar

WORKDIR /app

CMD ["java", "-jar", "producer.jar"]
