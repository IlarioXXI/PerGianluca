FROM amazoncorretto:11-alpine-jdk

ARG JAR_FILE=target/ordini-api-0.0.2.jar

COPY ${JAR_FILE} ordini.jar
ENTRYPOINT ["java","-jar","/ordini.jar"]