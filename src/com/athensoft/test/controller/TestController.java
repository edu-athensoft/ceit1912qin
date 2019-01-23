package com.athensoft.test.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.test.entity.News;
import com.athensoft.test.service.TestService;

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;
	
	
	@RequestMapping("")
	public String gotoHomePage(){
		return "index";
	}
	
	@RequestMapping("/home")
	public String gotoHomePage2(){
		return "index";
	}
	
	@RequestMapping("/datapage")
	public ModelAndView gotoDataPage(){
		String result = testService.processData();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("datapage");
		
		Map<String, Object> model = mav.getModel();
		model.put("mydata", result);
		
		return mav;
	}
	
	
	@RequestMapping("/dbpage")
	public ModelAndView gotoDbPage(){
		String result = testService.getFromDb();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("dbpage");
		
		Map<String, Object> model = mav.getModel();
		model.put("mydbdata", result);
		
		return mav;
	}
	
	
	
}
