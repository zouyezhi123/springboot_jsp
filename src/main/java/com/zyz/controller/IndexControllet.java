package com.zyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexControllet {

	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
