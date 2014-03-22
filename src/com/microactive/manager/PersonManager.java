package com.microactive.manager;

import com.microactive.po.Person;

public interface PersonManager {
	/**
	 * 保存人员
	 * @param person
	 */
	public void save(Person person);
	/**
	 *删除人员
	 * @param person
	 */
	public void delete(Person person);
	/**
	 * 更新人员
	 * @param person
	 */
	public void update(Person person);
	/**
	 * 根据用户名获取人员
	 * @param userName
	 * @return 
	 */
	public Person getPerson(String userName);

}
