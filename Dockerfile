FROM openjdk:11
RUN mkdir /app
COPY ./target/gpsUtil-spring-boot.jar /app/gpsUtil-0.0.1-SNAPSHOT.jar
WORKDIR /app
EXPOSE 8081
CMD "java" "-jar" "gpsUtil-0.0.1-SNAPSHOT.jar"