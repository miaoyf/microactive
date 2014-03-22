package com.microactive.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.microactive.dao.PersonDao;
import com.microactive.manager.PersonManager;
import com.microactive.manager.PersonRowMapper;
import com.microactive.po.Person;

public class PersonManagerImpl implements PersonManager {
	
	@Autowired
	private PersonDao personDao;
	
	public void save(Person person) {
		personDao.save(person);
	}

	@Override
	public Person getPerson(String userName) {
		return personDao.getPerson(userName);
	}

	@Override
	public void delete(Person person) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(Person person) {
		// TODO Auto-generated method stub
		
	}


}
