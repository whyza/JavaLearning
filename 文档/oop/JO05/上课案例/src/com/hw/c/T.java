package com.hw.c;

import java.util.Random;

public class T {

	/*
	 *
	 * 1、 请定义一个学生类:其属性Name,Age,Sex,提供一个ShowData方法来打印其属性值 2、
	 * 请定义一个老师类:其属性Name,Age,Sex,提供一个ShowData方法来打印其属性值 3、
	 * 请利用继承特性来优化上述代码,请再分别定义一个老师和一个学生对象，并赋值调用其ShowData方法 4、 再创建一个网管类，请建立继承关系 5、
	 * 随机产生一个0-2之间的数字 如果是’0’的话就创建一个学生类调用其ShowData()方法
	 * 如果是’1’的话就创建一个老师类调用其ShowData()方法 如果是’2’的话就创建一个网管类调用其ShowData()方法
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r = new Random();
		int num = r.nextInt(3);
		Person p;
		switch (num) {
		case 0:
			p=new Stu("狗蛋",11,'男');

			break;
		case 1:
			p=new Teacher("gouding",12,'女');

			break;
		default:
			p=new WG(" gouzi",13,'公');
			
			break;
		}
		p.show();
	}

}
