package com.oracle.jmAuto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oracle.jmAuto.dto.Faq;
import com.oracle.jmAuto.service.jw.CsService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Controller
@RequiredArgsConstructor
@Slf4j
public class JwController {
	
	private final CsService cs;
	
	// 1. 메인페이지에서 CS 메인으로 이동되었을때
	@GetMapping(value = "/view_jw/cs")
	public String main() {
		System.out.println("메롱JwController cs Start...");
		
		
		return "view_jw/csMain";
	}
	
	@RequestMapping(value = "listFaqStart")
	public String listFaqStart(Faq faq, Model model) {
		System.out.println("JwController listFaqStart Start...");
		
		int result = cs.FaqPage();
		System.out.println("JwController listFaqStart result->"+result);
		
		return "view_jw/csFaq";
	}
}
