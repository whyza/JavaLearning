package com.A.t1;
/*5��д����(��ʽ)
 
��������----->  ��װ����    �ķ���

��װ����----->  ��������   �ķ���

String----->��������       �ķ���

��������---->String       �ķ���
*/
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		��������----->  ��װ����    �ķ���
		Integer a = new Integer(12);
//		String a1 = new String("asdasd");
		
//		��װ����----->  ��������   �ķ���
		int num = a.valueOf(5);
//		String----->��������       �ķ���
		String a1 = "asa";
		int a2 = Integer.parseInt(a1);
//		��������---->String       �ķ���
		String str = String.valueOf(3);
	
	}

}
