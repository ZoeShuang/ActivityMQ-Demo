package com.example.config;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

@Configuration  
@EnableJms  
public class ActiveMQConfig {
    @Bean//配置一个消息队列  
    public Queue queue() {  
        return new ActiveMQQueue("my.message");  
    }  
   
   
}
