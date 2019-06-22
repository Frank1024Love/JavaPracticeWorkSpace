package com.dao;

import java.util.List;

import com.pojo.Tmingxi;

public class TmingxiDao {

	public int savemingxi(String jid,String jname,String jtesk,String jresult) {
		String sql="insert into tmingxi(jid,jname,jtesk,jresult) values(?,?,?,?)";
		return DH.update(sql, new String[] {jid,jname,jtesk,jresult});
	}
	
	public int updatemingxi(String id,String jname,String jtesk,String jresult) {
		String sql="update tmingxi set jname=?,jtesk=?,jresult=? where id=?";
		return DH.update(sql, new String[] {jname,jtesk,jresult,id});
	}
	
	public int delmingxi(String id) {
		String sql="delete from tmingxi where id=?";
		return DH.update(sql, new String[] {id});
	}
	
	public List getbyjid(String jid) {
		String sql="select * from tmingxi where jid=?";
		return DH.getall(sql, new Tmingxi(), new String[] {jid});
	}
	
}
