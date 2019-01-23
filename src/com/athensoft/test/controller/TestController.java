package com.athensoft.test.controller;

import java.util.List;
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
	
	
	@RequestMapping("/news")
	public ModelAndView getDataNewsList(){
		List<News> result = testService.getNewsList();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("news-list");
		
		Map<String, Object> model = mav.getModel();
		model.put("newsList", result);
		
		return mav;
	}
	
	@RequestMapping(value="/newsjson", produces="application/json")
	@ResponseBody
	public List<News> getDataNewsListJSON(){
		List<News> result = testService.getNewsList();
		
		return result;
	}
	
	
	
}
