package com.geek.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderController{
	
	@RequestMapping(value ="/get")
	public String get() {
		return "8001";
	}

}
