package com.a;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class WNL {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("年份");
		int year=in.nextInt();
		System.out.println("月份");
		int month=in.nextInt();
		Calendar cal=Calendar.getInstance();
		//对当前日期设置年份
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH,month-1);
		cal.set(Calendar.DATE,1);
		
		//求出空格数量
		int kgnum=cal.get(Calendar.DAY_OF_WEEK)-1;
		//这个月一共有多少天
		int days=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	//	System.out.println(kgnum);
		System.out.println("日\t一\t二\t三\t四\t五\t六");
//		打印空格
		for (int i = 1; i <=kgnum; i++) {
			System.out.print("\t");
		}
		//打印本月天shu 
		for (int i = 1; i <= days; i++) {
			System.out.print(i+"\t");
			if((i+kgnum)%7==0){
				System.out.println();
			}
		}
		
		
		Date d = cal.getTime();

		System.out.println(d.toLocaleString());

	}

}
