FROM java:openjdk-8u45-jdk
EXPOSE 8080
CMD java -jar springboot-0.0.1-SNAPSHOT.jar
ADD build/springboot-0.0.1-SNAPSHOT.jar .
