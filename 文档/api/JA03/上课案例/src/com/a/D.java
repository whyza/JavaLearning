package com.a;

import java.util.Calendar;
import java.util.Date;

public class D {

	public static void main(String[] args) {
		// ����ģʽ-ʵ�������󣬲����Լ�new������ͨ��getInstance��������ã�
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		// ��0��ʼ
		int month = cal.get(Calendar.MONTH);
		System.out.println(month);
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
		
		//���ĳ�������ܴﵽ��ʵ�����ֵ
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_YEAR));
		
		//�޸�ʱ��
		
		int dd = cal.get(Calendar.DATE);
		System.out.println(dd);
		
		
		
		Date d = cal.getTime();

		System.out.println(d.toLocaleString());
	}

}
