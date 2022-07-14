package com.srirambase.kafkaproducer.controller;

import com.srirambase.kafkaproducer.model.Device;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(value = "/kafka")
@RestController
public class DeviceProxyController {
    public static Logger LOGGER = LoggerFactory.getLogger(DeviceProxyController.class);
    @Autowired
    private KafkaTemplate<String, Device> kafkaTemplate;
    private static final String TOPIC = "Kafka_device_example";



    @PostMapping(value = "/publishDevice")
    public Device publishDeviceInfo(@RequestBody Device device){
        LOGGER.trace("producer received message : "+device);
        kafkaTemplate.send(TOPIC,device);
        LOGGER.trace("message has been successfully sent to the topic Kafka_device_example");
        return device;
    }
}
