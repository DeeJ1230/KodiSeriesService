FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD kodi-series-service-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=""
ENV DB_SCHEMA="MyVideos107"
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
