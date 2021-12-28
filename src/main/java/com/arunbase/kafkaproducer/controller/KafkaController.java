package com.arunbase.kafkaproducer.controller;

import com.arunbase.kafkaproducer.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/kafka")
@RestController
public class KafkaController {
    @Autowired
    private KafkaTemplate<String,User> kafkaTemplate;
    private static final String TOPIC = "Kafka_user_example";
    @PostMapping(value = "/saveUser")
    public String saveUserInfo(@RequestBody User user){
        kafkaTemplate.send(TOPIC,user);
        return "saved user";
    }
}
