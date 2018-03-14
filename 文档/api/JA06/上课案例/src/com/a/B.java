package com.a;

import java.io.File;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\Desktop\\N02\\JA06");
		System.out.println(f.isDirectory());

		// 返回该目录下所有的文件和文件夹
		File[] fs = f.listFiles();
		//找出该目录下所有的文本文档
		for (File ft : fs) {
			if(ft.isFile() && ft.getName().endsWith(".txt"))
			System.out.println(ft.getName());
			
		}

	}

}
