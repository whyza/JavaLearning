package com.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class F {

	public static void main(String[] args) {
		//��ȡһ���ļ�
		File f = new File("D:\\Desktop\\N02\\JA06\\1.txt");
		FileInputStream fis=null;
		//�ֽڶ�ȡ��
		try {
			fis=new FileInputStream(f);
			byte[] arr=new byte[(int) f.length()];
			fis.read(arr);
			
			
			
			for (byte b : arr) {
				System.out.print((char)b);
			}
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
