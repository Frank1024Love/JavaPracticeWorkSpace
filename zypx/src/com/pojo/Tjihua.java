package com.pojo;

import java.io.Serializable;

public class Tjihua implements Serializable {

	private int id;
	
	private String cdate;
	
	private String ctitle;
	
	private int uid;
	
	private String zt;
	
	private String fk;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCdate() {
		return cdate;
	}

	public void setCdate(String cdate) {
		this.cdate = cdate;
	}

	public String getCtitle() {
		return ctitle;
	}

	public void setCtitle(String ctitle) {
		this.ctitle = ctitle;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getZt() {
		return zt;
	}

	public void setZt(String zt) {
		this.zt = zt;
	}

	public String getFk() {
		return fk;
	}

	public void setFk(String fk) {
		this.fk = fk;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="{\"id\":\""+this.id+"\",\"cdate\":\""+this.cdate+"\",\"ctitle\":\""+this.ctitle+"\",\"zt\":\""+this.zt+"\",\"fk\":\""+this.fk+"\"}";
		return s;
	}
	
	
	
}
