package com.example.messageproducer;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.amqp.rabbit.listener.adapter.MessageListenerAdapter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MessageProducerApplication {

	@Value("${queue.order.name}")
	private String orderQueue;

	@Bean
	public Queue queue() {
		return new Queue(orderQueue, true);
	}

	public static void main(String[] args) {
		SpringApplication.run(MessageProducerApplication.class, args);
	}

}
