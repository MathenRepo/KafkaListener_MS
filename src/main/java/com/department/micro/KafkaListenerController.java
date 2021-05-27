package com.department.micro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class KafkaListenerController {

	@Autowired
	public KafkaTemplate<String, TradeListenerVO> kafkaTemplate;
	
	@Autowired
	public TradeListenerDAO tradeListenerDAO;
	
	private static final String TOPIC = "TestTopic"; 
	
	@RequestMapping("/displaymessage")
	@ResponseBody
	public String displayTrade(String trade)
	{
		List<TradeListenerVO> list = tradeListenerDAO.findAll();
		return list.get(list.size()-1).toString();
	}
}
