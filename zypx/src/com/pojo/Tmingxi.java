package com.pojo;

import java.io.Serializable;

public class Tmingxi implements Serializable {

	private int id;
	
	private int jid;
	
	private String jname;
	
	private String jtesk;
	
	private String jresult;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getJid() {
		return jid;
	}

	public void setJid(int jid) {
		this.jid = jid;
	}

	public String getJname() {
		return jname;
	}

	public void setJname(String jname) {
		this.jname = jname;
	}

	public String getJtesk() {
		return jtesk;
	}

	public void setJtesk(String jtesk) {
		this.jtesk = jtesk;
	}

	public String getJresult() {
		return jresult;
	}

	public void setJresult(String jresult) {
		this.jresult = jresult;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="{\"id\":\""+this.id+"\",\"jname\":\""+this.jname+"\",\"jtesk\":\""+this.jtesk+"\",\"jresult\":\""+this.jresult+"\",\"jid\":\""+this.jid+"\"}";
		return s;
	}
	
	
	
}
