package com.microactive.dao.impl;

import java.util.List;

import com.microactive.dao.BaseDao;
import com.microactive.dao.PersonDao;
import com.microactive.manager.PersonRowMapper;
import com.microactive.po.Person;

public class PersonDaoImpl extends BaseDao implements PersonDao {
	@Override
	public void save(Person person) {
		String sql="insert into person values(?,?,?)";
		Object[] args=new Object[]{person.getId(),person.getName(),person.getPwd()};
		super.save(sql, args);
	}

	@Override
	public void delete(Person person) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub

	}

	@Override
	public Person getPerson(String userName) {
		String sql="select * from person where name=?";
		Object[] args=new Object[]{userName};
		PersonRowMapper rowMapper=new PersonRowMapper();
		List result=super.find(sql, args, rowMapper);
		return (Person)result.get(0);
	}

}
