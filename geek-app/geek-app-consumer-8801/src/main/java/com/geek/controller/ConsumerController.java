package com.geek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.geek.service.DemoService;

@RestController
public class ConsumerController {

	@Autowired
	private RestTemplate rt;
	
	@Autowired
	private DemoService ds;

	private static final String URL = "http://provider";
	
	@RequestMapping("/con/get")
	public String get() {
		return rt.getForObject(URL + "/get", String.class);
	}
	
	@RequestMapping("/con/feignGet")
	public String feignGet() {
		return ds.get();
	}

}
