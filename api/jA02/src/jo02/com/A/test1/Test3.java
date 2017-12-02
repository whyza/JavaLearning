package jo02.com.A.test1;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个长度为6的整数密码");
		Scanner sc = new Scanner(System.in);
		int pwd = sc.nextInt();
		String str = Integer.toString(pwd);
		System.out.println(str);
		char[] arr = str.toCharArray();
		System.out.print(arr[0]);
		for (int i = 1; i < arr.length-1; i++) {
			int n = arr[i] - '0' + 5;
			n = n%10;
			if(arr[i] == '5') {
				n = 0;
			}
			System.out.print(n);
		}
		System.out.print(arr[arr.length-1]);
//		char a = '1';
//		int n = a - '0';
//		System.out.println("n = " + n);
	}

}
