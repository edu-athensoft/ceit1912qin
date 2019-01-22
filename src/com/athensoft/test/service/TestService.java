package com.athensoft.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.athensoft.test.dao.TestDao;

@Service
public class TestService {
	
	@Autowired
	@Qualifier("testDaoJdbcImpl")
	private TestDao testDao;
	
	public String processData(){
		//business logic goes here
		return "processed data";
	}
	
	public String getFromDb(){
		String result = testDao.findData();
		return result;
	}
}
