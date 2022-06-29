package com.budwhite.studying.kafka.consumer.demo.listener;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

    private final Logger logger = (Logger) LoggerFactory.getLogger(MessageListener.class);

    @KafkaListener(topics = "mytopic", groupId = "foo")
    public void listenGroupFoo(String message) {
        logger.info("Received Message in group foo: '{}'", message);
    }
}
