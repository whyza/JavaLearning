package com.a;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class WNL {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("���");
		int year=in.nextInt();
		System.out.println("�·�");
		int month=in.nextInt();
		Calendar cal=Calendar.getInstance();
		//�Ե�ǰ�����������
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH,month-1);
		cal.set(Calendar.DATE,1);
		
		//����ո�����
		int kgnum=cal.get(Calendar.DAY_OF_WEEK)-1;
		//�����һ���ж�����
		int days=cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	//	System.out.println(kgnum);
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
//		��ӡ�ո�
		for (int i = 1; i <=kgnum; i++) {
			System.out.print("\t");
		}
		//��ӡ������shu 
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
