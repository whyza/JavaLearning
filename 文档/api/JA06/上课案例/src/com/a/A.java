package com.a;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A {

	public static void main(String[] args) {

		// 文件目录(文件夹)类
		File f = new File("D:\\Desktop\\N02\\JA06\\1q.txt");
		// f = new File("E:\\7-29bak.GHO");

		// 判断是否是文件夹
		System.out.println(f.isDirectory());
		// 当前是否是文件
		System.out.println(f.isFile());

		Date d = new Date(f.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.ms");
		System.out.println(sdf.format(d));
		System.out.println(f.length());
		try {
			System.out.println(f.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 删除
		// System.out.println(f.delete());
		// f.deleteOnExit();

		// 判断文件是否存在
		System.out.println(f.exists());

		// 获取完整路径
		System.out.println(f.getPath());
		// 判断是否为隐藏文件
		System.out.println(f.isHidden());
		
		System.out.println(f.getName());
		
		
		
	}

}
