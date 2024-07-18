package com.suchi.rest;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(value= {"createdAt","updatedAt"})
public class User {

	@JsonProperty(value="user_id")
	private int id;
	
	@JsonProperty(value="user_name")
	private String userName;
	
	@JsonProperty(value="password")
	private String password;
	
	private Date createdAt;
	private Date updatedAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
