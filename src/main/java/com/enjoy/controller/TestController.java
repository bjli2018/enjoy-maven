package com.enjoy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//
@RestController
@RequestMapping("/test")
public class TestController {
	@RequestMapping("/hello")
	public String hello() {
		return "Hello Varian Medical Systems 111 !!!";
	}
}
