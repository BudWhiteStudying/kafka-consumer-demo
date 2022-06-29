# Kafka Consumer Demo

This trivial project demonstrates how to implement a consumer, powered by Spring Boot, for a Kafka cluster.

The project can be tested by starting a local Kafka cluster (see my [kafka-101-playground](https://github.com/BudWhiteStudying/kafka-101-playground) project for a one-command utility).

Once the cluster is up and running, and a topic has been defined on it, start this application; then produce one or more messages on the topic you started (see my [kafka-producer-demo](https://github.com/BudWhiteStudying/kafka-producer-demo) project for a working Spring Boot producer).

The messages will show up in the application logs e.g. 
```
2022-06-29 10:34:52.323  INFO 30417 --- [ntainer#0-0-C-1] c.b.s.k.c.demo.listener.MessageListener  : Received Message in group foo: 'end to end!'
```

The `application.properties` file allows to change minor configuration details such as the `bootstrap.address` property, or the port at which this application is exposed.

The `groupId` property is actually misleading: it *is* used in the configuration class, but it *can't* be used in the listener class... not the cleanest solution, I know.