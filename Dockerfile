FROM openjdk:11
RUN mkdir /app
COPY ./out/artifacts/gpsUtil_jar/gpsUtil.jar /app/gpsUtil.jar
WORKDIR /app
CMD "java" "-jar" "gpsUtil.jar"