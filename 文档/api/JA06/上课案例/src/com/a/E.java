package com.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E {

	public static void main(String[] args) {
		//��ȡһ���ļ�
		File f = new File("D:\\Desktop\\N02\\JA06\\1.txt");
		FileInputStream fis=null;
		//�ֽڶ�ȡ��
		try {
			fis=new FileInputStream(f);
			
			int n=fis.read();
			while(n!=-1){
				System.out.print((char)n);
				n=fis.read();
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
