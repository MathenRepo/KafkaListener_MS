package com.department.micro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

	@Autowired
	public KafkaListenerController kafkaListenerController;
	
	@Autowired
	public TradeListenerDAO tradeListenerDAO;
	
	@KafkaListener(topics = "TestTopic",groupId = "GrpId")
	public void consumer(String trade)
	{
		TradeListenerVO Object = new TradeListenerVO(0, trade);
		tradeListenerDAO.save(Object);
		System.out.println("Received Message : " + trade);
	}
}
