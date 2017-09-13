package cn.homjie.cloud.service.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

	private Logger logger = LoggerFactory.getLogger(getClass());

	@GetMapping(value = "/add")
	public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
		Integer r = a + b;
		logger.info("/add, result: " + r);
		return r;
	}
}
