package com.sunder.org;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class perfmonConfiguration {
    private final String TOPIC = "perfmon_topic";
    @Bean
    public NewTopic createTopic(){

        return new NewTopic(TOPIC,3,(short) 1);
    }
}
