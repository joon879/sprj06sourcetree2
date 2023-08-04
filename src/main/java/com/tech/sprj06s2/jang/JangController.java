package com.tech.sprj06s2.jang;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JangController {
	
	@RequestMapping("/jang1")
	public String jang1() {
		System.out.println("jang1로 이동");
		return "jang1";
	}
	
	
	@RequestMapping("/jang2")
	public String jang2() {
		System.out.println("jang2로 이동");
		return "jang2";
	}
	
	@RequestMapping("/jang3")
	public String jang3() {
		System.out.println("jang3으로 이동");
		return "jang3";
	}
	
}
