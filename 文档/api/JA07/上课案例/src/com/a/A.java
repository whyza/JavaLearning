package com.a;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File f=new File("D:\\Desktop\\N02\\JA03\\�Ͽαʼ�.txt");
		//��-�ļ���ȡ��
		try {
			FileReader fr=new FileReader(f);//ˮ��
			BufferedReader br=new BufferedReader(fr);//���
			//�����ȡ��
			
			String s="";
			while((s=br.readLine())!=null){
				System.out.println(s);
			}
			//��ȡ�����ַ���acsIIֵ
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
