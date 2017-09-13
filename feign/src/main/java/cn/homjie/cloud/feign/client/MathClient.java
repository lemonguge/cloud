package cn.homjie.cloud.feign.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("COMPUTE-SERVICE")
public interface MathClient {

	@GetMapping("add")
	Integer add(@RequestParam("a") Integer a, @RequestParam("b") Integer b);
}
