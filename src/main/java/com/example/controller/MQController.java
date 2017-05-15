package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mq.MQProduce;


@RestController
public class MQController {
	
	 @Autowired  
     private MQProduce produce;  
   
     
     @RequestMapping("/send/{msg}")  
     public String send(@PathVariable String msg) {  
         produce.send(msg);  
         return "Demo-3发送消息:"+msg;  
     }  
     
      
}
