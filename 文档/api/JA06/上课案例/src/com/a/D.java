package com.a;

import java.io.File;
import java.util.Scanner;

public class D {

	static int count = 0;
	static long sum = 0;

	public static void main(String[] args) {
		System.out.println("输入你要扫描垃圾文件的目录");
		// 认为exe是垃圾文件
		Scanner in = new Scanner(System.in);
		String d = in.next();

		File f = new File(d);

		Findexe(f);

		System.out.println("本共找到" + count + "个exe文件，合计" + (sum / 1024 / 1024) + "MB");
	}

	public static void Findexe(File ft) {
		File[] fs = ft.listFiles();
		for (File f : fs) {
			if (f.isFile() && f.getName().endsWith(".exe")) {
				count++;
				sum += f.length();
			}
			if (f.isDirectory()) {
				Findexe(f);//递归
			}
		}

	}

	public static void Delexe(File ft) {
		File[] fs = ft.listFiles();
		for (File f : fs) {
			if (f.isFile() && f.getName().endsWith(".exe")) {
				System.out.println(f.getPath() + "删除成功");
				// f.delete();
			}
			if (f.isDirectory()) {
				Findexe(f);// 递归

			}
		}

	}

}
