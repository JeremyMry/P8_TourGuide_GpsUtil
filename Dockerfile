FROM openjdk:11
WORKDIR /out/artifacts/gpsUtil_jar
ADD gpsUtil.jar gpsUtil.jar
EXPOSE 8081
CMD java -jar gpsUtil.jar
