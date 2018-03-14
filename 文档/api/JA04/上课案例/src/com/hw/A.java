package com.hw;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class A {
	/*
	 * 3、使用Calendar类, 编写程序求出你的出生的那一天是星期几. 并求出你出生到今天一共有多少天,打印输出.
	 * （getTime（）方法返回Date类， 再求至1970年1月1号毫秒数， 用今天的毫秒数减去出生日期的毫秒数）
	 * 
	 * 4、将一个长整型类型的数字，如: long a = 133411715032，
	 *  将换为日期对象， 将转换为本地时间格式在控制台输出。
	 * 输出格式:2012-4-11 12:10:35
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		// 王贤杰=1997-12-27
		cal.set(Calendar.YEAR, 1997);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 27);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) - 1);
		;
		// 并求出你出生到今天一共有多少天
		// 得到当前毫秒数
		Date d = new Date();
		long s = d.getTime() - cal.getTime().getTime();

		System.out.println(s / 1000 / 60 / 60 / 24);
		
		
		Date dd=new Date(133411715032l);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.ms");
		System.out.println(sdf.format(dd));;
	}

}
