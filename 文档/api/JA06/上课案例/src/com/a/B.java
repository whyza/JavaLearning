package com.a;

import java.io.File;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\Desktop\\N02\\JA06");
		System.out.println(f.isDirectory());

		// ���ظ�Ŀ¼�����е��ļ����ļ���
		File[] fs = f.listFiles();
		//�ҳ���Ŀ¼�����е��ı��ĵ�
		for (File ft : fs) {
			if(ft.isFile() && ft.getName().endsWith(".txt"))
			System.out.println(ft.getName());
			
		}

	}

}
