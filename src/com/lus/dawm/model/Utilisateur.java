package com.lus.dawm.model;

import java.io.Serializable;

public class Utilisateur implements Serializable{
	
	private int id;
 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
private String username;
 private String pwd;
 
public Utilisateur(int id, String username, String pwd) {
	
	this.username = username;
	this.pwd = pwd;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
@Override
public String toString() {
	return "Utilisateur [id=" + id + ", username=" + username + ", pwd=" + pwd + "]";
}
 
 
}
