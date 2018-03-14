package com.a;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("D:\\Desktop\\N02\\JA07\\12.txt");
	
		try {
			f.createNewFile();
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		try {
			FileOutputStream fos=new FileOutputStream(f);
			DataOutputStream dos=new DataOutputStream(fos);
			
			dos.writeInt(123456);
			dos.writeBoolean(true);
			dos.close();
			fos.close();
		
		
		
		
		
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
