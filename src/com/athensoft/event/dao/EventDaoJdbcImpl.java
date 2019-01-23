package com.athensoft.event.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("eventDaoJdbcImpl")
public class EventDaoJdbcImpl implements EventDao {

	@Override
	public String findData() {
		String result = "data from event db";
		return result;
	}

}