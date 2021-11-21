FROM maven:3.8-openjdk-11 AS builder
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package

FROM openjdk:11
WORKDIR /app
COPY --from=builder /tmp/target/rest*.jar /app/app.jar
COPY --from=builder /tmp/target/lib/ /app/lib
CMD ["java","-jar","app.jar"]