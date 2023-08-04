package com.tech.sprj06s.park;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PController {

	@RequestMapping("park/park1")
	public String park1() {
		
		return "park/park1";
	}
	@RequestMapping("park/park2")
	public String park2() {
		
		return "park/park2";
	}
	@RequestMapping("park/park3")
	public String park3() {
		
		return "park/park3";
	}
}
