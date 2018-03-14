package com.a;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("D:\\Desktop\\N02\\JA07\\1.txt");
		
		FileWriter fw=null;
		
		try {
			fw=new FileWriter(f,true);
			BufferedWriter bw=new BufferedWriter(fw);
			
			bw.write("11111");
			bw.newLine();
			bw.write("2222222");
			
			bw.close();
			fw.close();
			
			System.out.println("ok");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
