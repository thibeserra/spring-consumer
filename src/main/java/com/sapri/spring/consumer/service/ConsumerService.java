package com.sapri.spring.consumer.service;

import com.sapri.spring.consumer.dto.Message;

public interface ConsumerService {

	void action(Message message) throws Exception;
	
}
