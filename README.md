# spring-cloud-stream-kafka-demo
Spring kafka streams with functional style.

Download and install kafka https://kafka.apache.org/quickstart#quickstart_download.

Produce events every 5 seconds (configured on spring.cloud.stream.poller.fixed-delay).

Produce events with endpoint:

> curl -X POST -i http://localhost:9080/messages/send --data 'test'