package com.example.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class MQConsumer  {
	
	private String text;  

	/*@JmsListener(destination = "sample.queue")//监听指定消息队列  
    public void receiveQueue(String text) {  
       this.text = text;  
        System.out.println(text);  
    }  
  
	public String receive() {  
	     return text;  
	 }  */

}
