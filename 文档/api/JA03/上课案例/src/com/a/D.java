package com.a;

import java.util.Calendar;
import java.util.Date;

public class D {

	public static void main(String[] args) {
		// 单例模式-实例化对象，不是自己new，而是通过getInstance方法来获得，
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		// 从0开始
		int month = cal.get(Calendar.MONTH);
		System.out.println(month);
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
		
		//获得某部分所能达到的实际最大值
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_YEAR));
		
		//修改时间
		
		int dd = cal.get(Calendar.DATE);
		System.out.println(dd);
		
		
		
		Date d = cal.getTime();

		System.out.println(d.toLocaleString());
	}

}
