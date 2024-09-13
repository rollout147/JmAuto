package com.oracle.jmAuto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.oracle.jmAuto.service.main.MainService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MainController {
	
	private final MainService ms;
	
	// 메인페이지 시작
	@GetMapping(value = "/")
	public String main() {
		System.out.println("MainController main Start...");

		int result = 0;
		result = ms.SelectUser();
		System.out.println("MainController main result->"+result);
		
		return "main";
	}
	


	
}
