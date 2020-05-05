package com.sapri.spring.consumer.amqp;

import com.sapri.spring.consumer.dto.Message;

public interface AmqpConsumer {

	public void consumer(Message message);
}
