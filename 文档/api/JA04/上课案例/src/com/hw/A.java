package com.hw;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class A {
	/*
	 * 3��ʹ��Calendar��, ��д���������ĳ�������һ�������ڼ�. ����������������һ���ж�����,��ӡ���.
	 * ��getTime������������Date�࣬ ������1970��1��1�ź������� �ý���ĺ�������ȥ�������ڵĺ�������
	 * 
	 * 4����һ�����������͵����֣���: long a = 133411715032��
	 *  ����Ϊ���ڶ��� ��ת��Ϊ����ʱ���ʽ�ڿ���̨�����
	 * �����ʽ:2012-4-11 12:10:35
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		// ���ͽ�=1997-12-27
		cal.set(Calendar.YEAR, 1997);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 27);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK) - 1);
		;
		// ����������������һ���ж�����
		// �õ���ǰ������
		Date d = new Date();
		long s = d.getTime() - cal.getTime().getTime();

		System.out.println(s / 1000 / 60 / 60 / 24);
		
		
		Date dd=new Date(133411715032l);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.ms");
		System.out.println(sdf.format(dd));;
	}

}
