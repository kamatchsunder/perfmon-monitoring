package com.sunder.org;

import javax.annotation.PostConstruct;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OrgApplication {

    @Autowired
    private final PerfmonProducer producer;

    public OrgApplication() {
        producer = new PerfmonProducer();
    }

    public static void main(String[] args) {
        SpringApplication.run(OrgApplication.class, args);
    }


    @SneakyThrows
    @PostConstruct
    private void init() {
        for (int i = 0; i < 100; i++) {
            producer.sendMessage("hello", "perfmon_topic");
            Thread.sleep(1000);
        }

    }

}
