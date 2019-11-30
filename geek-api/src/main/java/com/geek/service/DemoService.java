package com.geek.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider")
public interface DemoService {

	@RequestMapping("get")
	public String get();
}
