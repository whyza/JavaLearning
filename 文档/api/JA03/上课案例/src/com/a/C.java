package com.a;

import java.text.SimpleDateFormat;
import java.util.Date;

public class C {

	public static void main(String[] args) {
		Date d=new Date();
		
		System.out.println(d);
		System.out.println(d.toLocaleString());
		//����ʱ������￪ʼ�ĺ�����=1900-1-1
		System.out.println(d.getTime());;
		//���ڱȽ�
//		d.after(arg0);
//		d.before(arg0)
		
		System.out.println(d.getYear());
		System.out.println(d.getMonth());
	
		
	
		
		
		//���ڸ�ʽ����
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.ms");
		System.out.println(sdf.format(d));;
		
	}

}
