package com.biz;

import com.dao.TjihuaDao;
import com.pojo.Tjihua;

public class TjihuaBiz {

	private TjihuaDao td=new TjihuaDao();
	
	public String savejihua(String cdate,String ctitle,String uid) {
		int num=td.savejihua(cdate, ctitle, uid);
		if (num>0) {
			return "{\"msg\":\"success\"}";
		}else {
			return "{\"msg\":\"error\"}";
		}
	}
	
	public String getone(String uid) {
		Tjihua j1=td.getone(uid);
		return j1.toString();
	}
	
}
