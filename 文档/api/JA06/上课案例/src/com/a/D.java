package com.a;

import java.io.File;
import java.util.Scanner;

public class D {

	static int count = 0;
	static long sum = 0;

	public static void main(String[] args) {
		System.out.println("������Ҫɨ�������ļ���Ŀ¼");
		// ��Ϊexe�������ļ�
		Scanner in = new Scanner(System.in);
		String d = in.next();

		File f = new File(d);

		Findexe(f);

		System.out.println("�����ҵ�" + count + "��exe�ļ����ϼ�" + (sum / 1024 / 1024) + "MB");
	}

	public static void Findexe(File ft) {
		File[] fs = ft.listFiles();
		for (File f : fs) {
			if (f.isFile() && f.getName().endsWith(".exe")) {
				count++;
				sum += f.length();
			}
			if (f.isDirectory()) {
				Findexe(f);//�ݹ�
			}
		}

	}

	public static void Delexe(File ft) {
		File[] fs = ft.listFiles();
		for (File f : fs) {
			if (f.isFile() && f.getName().endsWith(".exe")) {
				System.out.println(f.getPath() + "ɾ���ɹ�");
				// f.delete();
			}
			if (f.isDirectory()) {
				Findexe(f);// �ݹ�

			}
		}

	}

}
