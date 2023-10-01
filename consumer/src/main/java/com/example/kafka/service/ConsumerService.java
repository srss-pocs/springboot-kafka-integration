package com.example.kafka.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.kafka.dto.Customer;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ConsumerService {
	
	@Value("${kafka.server.url}")
	private String kafkaServerUrl;
	
	@Value("${kafka.topic.customer.name}")
	private String customerTopicName;
	
	@Value("${kafka.topic.message.name}")
	private String messageTopicName;

    @KafkaListener(topics = "springboot-kafka-json-demo-topic",groupId = "sbk-group")
    public void consumeEvents(Customer customer) {
        log.info("consumer consume the events {} ", customer.toString());
    }

    @KafkaListener(topics = "springboot-kafka-string-demo-topic",groupId = "sbk-group")
    public void consumeMessage(String message) {
        log.info("consumer2 consume the message {} ", message);
    }

    /*   @KafkaListener(topics = "messageTopicName",groupId = "sbk-group")
    public void consume3(String message) {
        log.info("consumer3 consume the message {} ", message);
    }

    @KafkaListener(topics = "messageTopicName",groupId = "sbk-group")
    public void consume4(String message) {
        log.info("consumer4 consume the message {} ", message);
    } */
}