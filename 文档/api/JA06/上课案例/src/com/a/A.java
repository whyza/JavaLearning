package com.a;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class A {

	public static void main(String[] args) {

		// �ļ�Ŀ¼(�ļ���)��
		File f = new File("D:\\Desktop\\N02\\JA06\\1q.txt");
		// f = new File("E:\\7-29bak.GHO");

		// �ж��Ƿ����ļ���
		System.out.println(f.isDirectory());
		// ��ǰ�Ƿ����ļ�
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
		// ɾ��
		// System.out.println(f.delete());
		// f.deleteOnExit();

		// �ж��ļ��Ƿ����
		System.out.println(f.exists());

		// ��ȡ����·��
		System.out.println(f.getPath());
		// �ж��Ƿ�Ϊ�����ļ�
		System.out.println(f.isHidden());
		
		System.out.println(f.getName());
		
		
		
	}

}
