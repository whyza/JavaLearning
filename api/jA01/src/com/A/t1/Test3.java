package com.A.t1;

import java.util.Scanner;

/*�ж��ֻ������Ƿ�Ϊ138����
����:
1)	���ȱ���Ϊ11λ
2)	ǰ��λ�ַ�����Ϊ��138��
*/
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str  = sc.next();
		if(str.length() == 11 && str.startsWith("138")) {
			System.out.println("������ȷ");
		}else{
			System.out.println("����ĵ绰���벻��ȷ");
		}
	}
}
