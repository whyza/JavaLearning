package com.A.t1;
/*5、写出：(格式)
 
基本类型----->  包装类型    的方法

包装类型----->  基本类型   的方法

String----->基本类型       的方法

基本类型---->String       的方法
*/
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		基本类型----->  包装类型    的方法
		Integer a = new Integer(12);
//		String a1 = new String("asdasd");
		
//		包装类型----->  基本类型   的方法
		int num = a.valueOf(5);
//		String----->基本类型       的方法
		String a1 = "asa";
		int a2 = Integer.parseInt(a1);
//		基本类型---->String       的方法
		String str = String.valueOf(3);
	
	}

}
