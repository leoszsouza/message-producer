package com.example.messageproducer.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    private OrderQueueSender orderQueueSender;

    @Override
    public void run(String... args) throws Exception {
        for(int i = 0; i <300000; i++){
            orderQueueSender.send("teste: "+i);
        }
    }
}
