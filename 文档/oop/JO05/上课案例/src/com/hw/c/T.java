package com.hw.c;

import java.util.Random;

public class T {

	/*
	 *
	 * 1�� �붨��һ��ѧ����:������Name,Age,Sex,�ṩһ��ShowData��������ӡ������ֵ 2��
	 * �붨��һ����ʦ��:������Name,Age,Sex,�ṩһ��ShowData��������ӡ������ֵ 3��
	 * �����ü̳��������Ż���������,���ٷֱ���һ����ʦ��һ��ѧ�����󣬲���ֵ������ShowData���� 4�� �ٴ���һ�������࣬�뽨���̳й�ϵ 5��
	 * �������һ��0-2֮������� ����ǡ�0���Ļ��ʹ���һ��ѧ���������ShowData()����
	 * ����ǡ�1���Ļ��ʹ���һ����ʦ�������ShowData()���� ����ǡ�2���Ļ��ʹ���һ�������������ShowData()����
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		int num = r.nextInt(3);
		Person p;
		switch (num) {
		case 0:
			p=new Stu("����",11,'��');

			break;
		case 1:
			p=new Teacher("gouding",12,'Ů');

			break;
		default:
			p=new WG(" gouzi",13,'��');
			
			break;
		}
		p.show();
	}

}
