FROM eclipse-temurin:21-jre-alpine

LABEL authors="tkuzub"

ARG JAR_FILE

RUN : "${JAR_FILE:?JAR_FILE must not be empty}"

WORKDIR /app

COPY target/${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]