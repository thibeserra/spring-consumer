package com.sapri.spring.consumer.service.implementation;

import org.springframework.stereotype.Service;

import com.sapri.spring.consumer.dto.Message;
import com.sapri.spring.consumer.service.ConsumerService;

@Service
public class ConsumerServiceImpl implements ConsumerService {

	@Override
	public void action(Message message) throws Exception {
		
//		throw new Exception("Erro");
		
		System.out.println(message.getText());
		
	}

	
	
}
