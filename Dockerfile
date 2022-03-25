FROM openjdk:11
COPY /target/crudapp-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch crudapp-0.0.1-SNAPSHOT.jar'
ARG JAR_FILE=target/basic-spring-boot-docker-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","crudapp-0.0.1-SNAPSHOT.jar"]

#FROM adoptopenjdk:11-jre-hotspot
#ARG JAR_FILE=*.jar
#COPY ${JAR_FILE} ../../target/crudapp-0.0.1-SNAPHSHOT.jar
#ENTRYPOINT ["java", "-jar", "crudapp-0.0.1-SNAPHSHOT.jar"]