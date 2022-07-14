FROM openjdk:11
ADD target/kafka-producer.jar kafka-producer.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","kafka-producer.jar"]