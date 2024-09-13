package com.oracle.jmAuto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class JmController {
	@GetMapping(value = "/view_jm/join")
	public String join() {
		log.info("MainController main() is started");		
		return "view_jm/join";
	}
	@GetMapping(value = "/view_jm/login")
	public String login() {
		log.info("MainController main() is started");		
		return "view_jm/login";
	}

}
