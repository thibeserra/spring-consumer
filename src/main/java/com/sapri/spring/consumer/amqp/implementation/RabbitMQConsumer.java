package com.sapri.spring.consumer.amqp.implementation;

import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sapri.spring.consumer.amqp.AmqpConsumer;
import com.sapri.spring.consumer.dto.Message;
import com.sapri.spring.consumer.service.ConsumerService;

@Component
public class RabbitMQConsumer implements AmqpConsumer {

	@Autowired
	private ConsumerService consumerService;
	
	@Override
	@RabbitListener(queues = "${spring.rabbitmq.exchenge.routing-key.producer}")
	public void consumer(Message message) {
		
		try {
			this.consumerService.action(message);			
		} catch(Exception e) {
			throw new AmqpRejectAndDontRequeueException(e);
		}
		
		
	}

}
