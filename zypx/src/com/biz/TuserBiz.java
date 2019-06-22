package com.biz;

import com.dao.TuserDao;
import com.pojo.Tuser;

public class TuserBiz {

	public String login(String uname,String upwd) {
		TuserDao td=new TuserDao();
		String s="";
		
		Tuser u1=new Tuser();
		u1.setUname(uname);
		DL d=DL.getdl();
		Boolean b=d.checkuser(u1);
		if (b) {
			s="{\"msg\":\"input\"}";
		} else {
			Tuser u=td.login(uname, upwd);
			
			if (u==null) {
				s="{\"msg\":\"error\"}";
			} else {
				d.saveuser(u);
				s=u.toString();
			}
		}
		
		return s;
	}
	
	
	
}
