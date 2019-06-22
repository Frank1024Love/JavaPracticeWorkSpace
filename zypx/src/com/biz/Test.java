package com.biz;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TuserBiz tb=new TuserBiz();
//		String s=tb.login("lixiaoshan", "123456");
//		System.out.println(s);
		TmenuBiz tb=new TmenuBiz();
		String s=tb.getbyuid("1");
		System.out.println(s);
	}

}
