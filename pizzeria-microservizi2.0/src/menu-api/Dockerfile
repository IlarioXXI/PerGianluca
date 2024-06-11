FROM amazoncorretto:11-alpine-jdk

ARG JAR_FILE=target/menu-api-0.0.2.jar

COPY ${JAR_FILE} menu.jar
ENTRYPOINT ["java","-jar","/menu.jar"]