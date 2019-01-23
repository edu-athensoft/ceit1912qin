package com.athensoft.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.athensoft.test.dao.TestDao;
import com.athensoft.test.entity.News;

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
	
	
	public List<News> getNewsList(){
		List<News> result = testDao.findAll();
		return result;
	}
}
