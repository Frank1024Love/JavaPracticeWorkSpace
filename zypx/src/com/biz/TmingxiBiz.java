package com.biz;

import java.util.List;

import com.dao.DH;
import com.dao.TmingxiDao;
import com.pojo.Tmingxi;

public class TmingxiBiz {

	private TmingxiDao td=new TmingxiDao();
	
	public String savemingxi(String jid,String jname,String jtesk,String jresult) {
		int num=td.savemingxi(jid, jname, jtesk, jresult);
		if (num>0) {
			return "{\"msg\":\"success\"}";
		} else {
			return "{\"msg\":\"error\"}";
		}
	}
	
	public String updatemingxi(String id,String jname,String jtesk,String jresult) {
		int num=td.updatemingxi(id, jname, jtesk, jresult);
		if (num>0) {
			return "{\"msg\":\"success\"}";
		} else {
			return "{\"msg\":\"error\"}";
		}
	}
	
	public String delmingxi(String id) {
		int num=td.delmingxi(id);
		if (num>0) {
			return "{\"msg\":\"success\"}";
		} else {
			return "{\"msg\":\"error\"}";
		}
	}
	
	public String getbyjid(String jid) {
		List l=td.getbyjid(jid);
		String s="[";
		for (int i = 0; i < l.size(); i++) {
			s+=l.get(i).toString()+",";
		}
		if (l.size()>0) {
			s=s.substring(0, s.length()-1);
		}
		s+="]";
		return s;
	}
	
}
