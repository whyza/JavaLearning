package com.B.test1;

import java.util.Random;

public class test {
	public static void main(String[] args) {
		Random r = new Random();
		int num = r.nextInt(3);
		if(num == 0) {
			Student s = new Student();
			s.setAge(12);
			s.setName("����");
			s.setSex('��');
			s.ShowData();
		}else if(num == 1) {
			Teacher t = new Teacher();
			t.setAge(20);
			t.setName("����");
			t.setSex('Ů');
			t.ShowData();
		}else {
			WangGuan w = new WangGuan();
			w.setAge(31);
			w.setName("����");
			w.setSex('��');
			w.ShowData();
		}
	}
}
