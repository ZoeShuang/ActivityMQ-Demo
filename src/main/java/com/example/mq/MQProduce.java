package com.example.mq;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;


@Component
public class MQProduce  {

	@Autowired
	private JmsTemplate jmsTemplate;

	@Autowired
	private Queue queue;

	
	public void send(String msg) {// 向指定队列中发送消息
		this.jmsTemplate.convertAndSend(this.queue, msg);
		System.out.println("Demo-3发送消息:"+msg);
	}

}
