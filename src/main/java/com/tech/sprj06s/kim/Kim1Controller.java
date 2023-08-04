package com.tech.sprj06s.kim;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Kim1Controller {

	@RequestMapping("/kim1/kim1")
	public String kim1() {
		return "/kim1/kim1";
	}
	
	@RequestMapping("/kim1/kim2")
	public String kim2() {
		return "/kim1/kim2";
	}
	
	@RequestMapping("/kim1/kim3")
	public String kim3() {
		return "/kim1/kim3";
	}
}
