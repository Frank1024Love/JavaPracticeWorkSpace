package com.dao;

import java.util.List;

import com.pojo.Tjihua;

public class TjihuaDao {

	public int savejihua(String cdate,String ctitle,String uid) {
		String sql="insert into tjihua(cdate,ctitle,uid) values(?,?,?)";
		return DH.update(sql, new String[] {cdate,ctitle,uid});
	}
	
	public List getbyuid(String uid) {
		String sql="select * from tjihua where uid=?";
		return DH.getall(sql, new Tjihua(), new String[] {uid});
	}
	
	public Tjihua getone(String uid) {
		String sql="SELECT * from tjihua where uid=? and zt='Œ¥…Û∫À' ORDER BY id DESC LIMIT 1";
		List l=DH.getall(sql, new Tjihua(), new String[] {uid});
		return (Tjihua) l.get(0);
	}
	
}
