package com.microactive.po;

public class Person {
	int id;
	String name;//”√ªß√˚
	String pwd;//√‹¬Î
	
	public Person(String name, String pwd) {
		this.name=name;
		this.pwd=pwd;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	

}
