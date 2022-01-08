package com.group.restfulwebservices.user;

import java.util.Date;

public class User {

	private Integer id;
	
	private String name;
	
	public User() {
		super();
	}

	private Date birthDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getbirthDate() {
		return birthDate;
	}

	public void setbirthDate(Date birthDate) {
		this.birthDate= birthDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", birthDate=" + birthDate + "]";
	}

	public User(Integer id, String name, Date birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	
}
