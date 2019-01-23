package com.athensoft.test.dao;

import java.util.List;

import com.athensoft.test.entity.News;

public interface TestDao {
	public String findData();
	public List<News> findAll();
	
}
