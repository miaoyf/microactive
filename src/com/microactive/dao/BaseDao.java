package com.microactive.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class BaseDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	/**
	 * 保存操作
	 * @param sql sql语句
	 * @param args 参数值
	 */
	public void save(String sql,Object[] args){
		jdbcTemplate.update(sql, args);
	}
	/**
	 * 查询对象
	 * @param sql
	 * @param args
	 * @param rowMapper
	 * @return
	 */
	public List find(String sql,Object[] args,RowMapper rowMapper){
		return this.jdbcTemplate.query(sql, args, rowMapper);
	}
	/**
	 * 更新对象
	 * @param sql
	 * @param args
	 */
	public void update(String sql,Object[] args){
		jdbcTemplate.update(sql, args);
	}
	
	public void delete(){
		
	}

}
