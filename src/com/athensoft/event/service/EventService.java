package com.athensoft.event.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.athensoft.event.dao.EventDao;

@Service
public class EventService {
	
	@Autowired
	@Qualifier("eventDaoJdbcImpl")
	private EventDao eventDao;
	
	public String processData(){
		//business logic goes here
		return "processed data";
	}
	
	public String getFromDb(){
		String result = eventDao.findData();
		return result;
	}
}