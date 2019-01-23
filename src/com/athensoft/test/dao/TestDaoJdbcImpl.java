package com.athensoft.test.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.athensoft.test.entity.News;

@Repository
@Qualifier("testDaoJdbcImpl")
public class TestDaoJdbcImpl implements TestDao {

	protected NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}
	
	@Override
	public String findData() {
		String result = "data from db";
		return result;
	}

	@Override
	public List<News> findAll() {
		//retrieve data from db via APIs
			//get connection from datasource
		
			//sql
		String sql = "select global_id,event_uuid,title from event_news";
			//execute query

		List<News> result = jdbc.query(sql, new NewsRowMapper());		//ORM
		
		//return result in format of java object(s)
		return result;
	}
	

	private static class NewsRowMapper implements RowMapper<News> {
		public News mapRow(ResultSet rs, int rowNumber) throws SQLException {
			News x = new News();
			x.setGlobalId(rs.getLong("global_id"));
			x.setEventUUID(rs.getString("event_uuid"));
			x.setTitle(rs.getString("title"));
			return x;
		}
	}
	
}
