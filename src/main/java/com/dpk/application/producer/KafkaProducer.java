package com.dpk.application.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dpk.application.constant.Topic;

@RestController
@RequestMapping("kafka")
public class KafkaProducer {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	
	@PostMapping("/publish")
	public String publishMessage(@RequestBody String message) {
		kafkaTemplate.send(Topic.MESSAGE_TOPIC, message);
		return "Message published!";
	}
}
