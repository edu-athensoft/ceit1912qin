package com.athensoft.event.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.athensoft.event.service.EventService;

@Controller
public class EventController {

	@Autowired
	private EventService eventService;
	
	@RequestMapping("/newsdbpage")
	public ModelAndView gotoDbPage(){
		String result = eventService.getFromDb();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("newsdbpage");
		
		Map<String, Object> model = mav.getModel();
		model.put("mynewsdbdata", result);
		
		return mav;
	}
}
