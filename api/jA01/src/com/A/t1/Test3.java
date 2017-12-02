package com.A.t1;

import java.util.Scanner;

/*判断手机号码是否为138号码
条件:
1)	长度必须为11位
2)	前三位字符必须为”138”
*/
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str  = sc.next();
		if(str.length() == 11 && str.startsWith("138")) {
			System.out.println("号码正确");
		}else{
			System.out.println("输入的电话号码不正确");
		}
	}
}
