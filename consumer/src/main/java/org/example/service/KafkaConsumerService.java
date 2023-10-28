package org.example.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    @KafkaListener(topics = "product-topic-1", groupId = "product-consumer-group")
    public void listen(String message) {
        System.out.println("Received: " + message);
    }
}
