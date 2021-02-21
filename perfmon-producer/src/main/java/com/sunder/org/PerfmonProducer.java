package com.sunder.org;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PerfmonProducer {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Autowired
    private NewTopic newTopic;

    public void sendMessage(String message, String topic){

        this.kafkaTemplate.send(topic,message);
    }

}
