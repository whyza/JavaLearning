package com.hw;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C {

	public static void main(String[] args) {
		// 复制图片
		//1-找到要复制的图片
		File f=new File("D:\\Desktop\\N02\\0.jpg");
		
		File fgo=new File("D:\\Desktop\\N02\\JA07\\0.jpg");
		
		byte[] bs=new byte[(int) f.length()];
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(f);
			fis.read(bs);
			
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		if(!fgo.exists()){
			try {
				fgo.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		FileOutputStream fos=null;
		
		try {
			fos=new FileOutputStream(fgo);
			fos.write(bs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("done");
		
		
		
		
	
	}

}
