package com.dao;

import java.util.List;

import com.pojo.Tuser;

public class TuserDao {

	public Tuser login(String uname,String upwd) {
		String sql="select * FROM tuser where uname=? and upwd=?";
		List l=DH.getall(sql, new Tuser(), new String[] {uname,upwd});
		if (l.size()==0) {
			return null;
		}else {
			return (Tuser) l.get(0);
		}
	}
	
}
