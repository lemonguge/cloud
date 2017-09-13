package cn.homjie.cloud.feign.controller;

import cn.homjie.cloud.feign.client.MathClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

	@Autowired
	private MathClient mathClient;

	@GetMapping(value = "/add")
	public Integer add() {
		return mathClient.add(12, 23);
	}
}