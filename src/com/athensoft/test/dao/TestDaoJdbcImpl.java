package com.athensoft.test.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("testDaoJdbcImpl")
public class TestDaoJdbcImpl implements TestDao {

	@Override
	public String findData() {
		String result = "data from db";
		return result;
	}

}
