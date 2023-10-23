FROM eclipse-temurin:21-jdk-alpine
RUN apk update && apk upgrade
RUN apk add jq && apk add curl && apk add unzip && apk add git
LABEL MAINTAINER="Edwi Feitoza"
ARG JAR_FILE=*.jar
COPY ${JAR_FILE} /app.jar
COPY app.sh /
RUN chmod 0755 /app.sh
CMD /app.sh