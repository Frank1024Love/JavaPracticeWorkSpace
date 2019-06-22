package com.pojo;

import java.io.Serializable;

public class Trole implements Serializable {

	private int id;
	
	private String rolename;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
	
	
}
