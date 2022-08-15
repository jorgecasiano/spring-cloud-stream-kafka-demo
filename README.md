# spring-cloud-stream-kafka-demo
Spring kafka streams with functional style.

Run docker compose and applications:

```console
> docker compose up -d
> mvn clean
> mvn -f spring-cloud-stream-kafka-demo-producer/pom.xml exec:java -Dexec.mainClass="producer.SpringCloudKafkaDemoProducerApplication"
> mvn -f spring-cloud-stream-kafka-demo-consumer/pom.xml exec:java -Dexec.mainClass="consumer.SpringCloudKafkaDemoConsumerApplication"
```

Produce events with endpoint:

> curl -X POST -i http://localhost:9080/messages/send --data 'test'