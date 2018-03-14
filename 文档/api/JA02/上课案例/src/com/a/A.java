package com.a;

public class A {

	public A() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("今年天气不错……是个去小树林的好时机……");
		//追加内容
		sb.append("王贤杰心动了");
		sb.append(3.14);
		//指定位置插入新值
		sb.insert(6, "!");
		//删除指定内容，包头不包尾
		sb.delete(1, 4);
		///删除指定位置字符
		sb.deleteCharAt(1);
		//替换指定位置字符
		sb.setCharAt(1, '对');
		
		//反转顺序
		sb.reverse();
		System.out.println(sb);
	}

}
