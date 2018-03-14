package com.a;

import java.io.File;

public class C {

	public static void main(String[] args) {
		File f=new File("D:\\");
		
		//入口
		FindJava(f);
	}
	//传递一个目录过来找出该目录里所有的java文件
	
	public static void FindJava(File ft){
		File[] fs=ft.listFiles();
		for (File fts : fs) {
			//是文件
			if(fts.isFile() && fts.getName().endsWith(".java")){
			//if(fts.isFile() && fts.isHidden()){
				System.out.println(fts.getPath());
			}
			//是目录
			if(fts.isDirectory()){
				FindJava(fts);
				
			}
			
		}
		
	}

}
