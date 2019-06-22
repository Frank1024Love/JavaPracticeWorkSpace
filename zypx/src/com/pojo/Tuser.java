package com.pojo;

import java.io.Serializable;

//可序列化
public class Tuser implements Serializable {

	private int id;
	
	private String uname;
	
	private String upwd;
	
	private String realname;
	
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override//注解
	public String toString() {
		// TODO Auto-generated method stub
		String s="{\"id\":\""+this.id+"\",\"realname\":\""+this.realname+"\"}";
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Tuser u1=(Tuser)obj;
		if (u1.getUname().equals(this.uname)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	
	
	
}
