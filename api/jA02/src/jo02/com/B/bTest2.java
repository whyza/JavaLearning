package jo02.com.B;

import java.util.Scanner;

public class bTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���---");
		String str = sc.next();
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[arr.length - i - 1]) {
				System.out.println(str + "�ǻ�����");
			} else {
				System.out.println(str + "���ǻ�����");
			}
		}
		
		
		System.out.println("������һ���ַ���===========");
		StringBuffer ss = new StringBuffer(sc.next());
		String s1 = ss.toString();
		StringBuffer sss = ss.reverse();
		String s2 = sss.toString();
		if(s1.equals(s2)) {
			System.out.println(s1+"�ǻ�����");
		}else {
			System.out.println(s1+"���ǻ�����");
		}
	}

}
