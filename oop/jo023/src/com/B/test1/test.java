package com.B.test1;

import java.util.Random;

public class test {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(3);
		if(num == 0) {
			Student s = new Student();
			s.setAge(12);
			s.setName("张三");
			s.setSex('男');
			s.ShowData();
		}else if(num == 1) {
			Teacher t = new Teacher();
			t.setAge(20);
			t.setName("李四");
			t.setSex('女');
			t.ShowData();
		}else {
			WangGuan w = new WangGuan();
			w.setAge(31);
			w.setName("王五");
			w.setSex('男');
			w.ShowData();
		}
	}
}
