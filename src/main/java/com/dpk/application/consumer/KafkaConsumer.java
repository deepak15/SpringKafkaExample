package com.dpk.application.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
	
	
	@KafkaListener(topics = "TopicOne")
    public void consume(String message) {
        System.out.println("Message consumed by kafka comsumer : " + message);
    }


   
}

