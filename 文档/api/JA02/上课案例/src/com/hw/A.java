package com.hw;

public class A {
/**
 * 3��Email��ַ��֤:
������ò�Ҫ�����е��ж϶�д��һ��,���жϲ�ִ���
1:�ض�����.��@
2:.��@����λ����β
3:.���Գ��ֶ��,��@ֻ��һ��
4:.������@֮ǰ����
5:.���ܽ���@�������
6:.������������
7:ĩβ������.com,.net,.cn,.org��β


 * @param args
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String email="7207542@qq.com";
		
//		1:�ض�����.��@
		if(email.indexOf(".")<=0 || email.indexOf("@")<=0){
			System.out.println("���䲻�Ϸ�");
			return;
		}
//		2:.��@����λ����β
		if(email.lastIndexOf(".")==email.length()-1 ||email.lastIndexOf("@")==email.length()-1){
			System.out.println("���䲻�Ϸ�");
			return;
			
		}
		
//		3:.���Գ��ֶ��,��@ֻ��һ��
		if(email.indexOf("@")!=email.lastIndexOf("@")){
			System.out.println("���䲻�Ϸ�");
			return;
			
		}
		
		
//		4:.������@֮ǰ����
		if(email.indexOf(".")< email.indexOf("@")){
			System.out.println("���䲻�Ϸ�");
			return;
		}
		
//		5:.���ܽ���@�������
		if(email.indexOf("@.")>0){
			System.out.println("���䲻�Ϸ�");
			return;
		}
		
//		6:.������������
//		7:ĩβ������.com,.net,.cn,.org��β
		if(!(email.endsWith(".com") || email.endsWith(".net") ||email.endsWith(".cn")||email.endsWith(".org")))
		{	System.out.println("���䲻�Ϸ�");
		return;
			
		}
		
		System.out.println("�Ϸ�");
		
	}

}
