package com.athensoft.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.athensoft.test.entity.News;

@Controller
@RequestMapping("/test")
public class TestJsonController {
	
	@RequestMapping(value={"/news"}, produces="application/json")
	@ResponseBody
	public News getDataNews(){
		News news1 = new News(1001L,"uuid-1001", "title-1101");
		return news1;
	}
	
	@RequestMapping("/test2")
	public String gotoHomePage(){
		return "index";
	}
}
