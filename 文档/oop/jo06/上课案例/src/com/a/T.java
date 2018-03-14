package com.a;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		try {
			System.out.println("请输入第一个数");
			int a = in.nextInt();
			System.out.println("请输入第二个数");
			int b = in.nextInt();
			System.out.println(a + "/" + b + "=" + (a / b));
		} catch (ArithmeticException e) {// 抓出错误
			System.out.println("除数为0 的错误");
		} catch (InputMismatchException e1) {
			System.out.println("输入不匹配");
		} catch(Exception e2){
			System.out.println("发生未知错误");
		} finally {
			//无论如何最终都会走的代码块
		}

	}

}
