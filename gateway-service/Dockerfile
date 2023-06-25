FROM openjdk:17

RUN apk update & apk add bash

COPY wait-for-it.sh .

VOLUME /tmp
EXPOSE 8081

ADD target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]