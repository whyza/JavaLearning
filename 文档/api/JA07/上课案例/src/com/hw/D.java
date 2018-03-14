package com.hw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class D {

	public static void main(String[] args) {
	
		File f=new File("D:\\Desktop\\N02\\JA06\\1.txt");
		File f2=new File("D:\\Desktop\\N02\\JA06\\2.txt");
	try {
		f2.createNewFile();
	} catch (IOException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream(f);
			fos=new FileOutputStream(f2);
			try {
				byte[] bs=new byte[4];		
				int a=0;
				while((a=fis.read(bs, 0, 4))!=-1){
					fos.write(bs, 0, a);
				}
				//从文件中读取前四个字符放入bs数组
//				a=fis.read(bs, 0, 4);
//				System.out.println(a);
//				a=fis.read(bs, 0, 4);
//				System.out.println(a);
//				a=fis.read(bs, 0, 4);
//				System.out.println(a);
//				a=fis.read(bs, 0, 4);
//				System.out.println(a);
				fos.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
