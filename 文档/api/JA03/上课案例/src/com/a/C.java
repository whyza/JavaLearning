package com.a;

import java.text.SimpleDateFormat;
import java.util.Date;

public class C {

	public static void main(String[] args) {
		Date d=new Date();
		
		System.out.println(d);
		System.out.println(d.toLocaleString());
		//返回时间参照物开始的毫秒数=1900-1-1
		System.out.println(d.getTime());;
		//日期比较
//		d.after(arg0);
//		d.before(arg0)
		
		System.out.println(d.getYear());
		System.out.println(d.getMonth());
	
		
	
		
		
		//日期格式化类
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.ms");
		System.out.println(sdf.format(d));;
		
	}

}
