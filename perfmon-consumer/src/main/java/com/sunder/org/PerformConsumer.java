package com.sunder.org;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PerformConsumer {

    @KafkaListener(topics = "perfmon_topic",groupId = "group_id")
    public void consume(String msg){
        System.out.println(msg);
    }
}
