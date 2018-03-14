package com.a;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("D:\\Desktop\\N02\\JA03\\上课笔记.txt");
		//器-文件读取器
		try {
			FileReader fr=new FileReader(f);//水泵
			BufferedReader br=new BufferedReader(fr);//电泵
			//缓冲读取器
			
			String s="";
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
			//读取单个字符的acsII值
			//System.out.println((char)fr.read());;
		
			
			
			br.close();
			fr.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
