package com.B.test1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Teacher t = new java("张三", 31);
		t.Show();
		t.Teach();
		t = new Mysql("李四", 33) {};
		t.Show();
		t.Teach();
		t = new Net("王五", 36) {};
		t.Show();
		t.Teach();
	}

}
