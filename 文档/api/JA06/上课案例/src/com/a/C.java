package com.a;

import java.io.File;

public class C {

	public static void main(String[] args) {
		File f=new File("D:\\");
		
		//���
		FindJava(f);
	}
	//����һ��Ŀ¼�����ҳ���Ŀ¼�����е�java�ļ�
	
	public static void FindJava(File ft){
		File[] fs=ft.listFiles();
		for (File fts : fs) {
			//���ļ�
			if(fts.isFile() && fts.getName().endsWith(".java")){
			//if(fts.isFile() && fts.isHidden()){
				System.out.println(fts.getPath());
			}
			//��Ŀ¼
			if(fts.isDirectory()){
				FindJava(fts);
				
			}
			
		}
		
	}

}
