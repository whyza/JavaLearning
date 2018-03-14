package com.a;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("D:\\Desktop\\N02\\JA07\\12.txt");
		
		try {
			FileInputStream fis=new FileInputStream(f);
				DataInputStream dis=new DataInputStream(fis);
				
				System.out.println(dis.readInt());
				System.out.println(dis.readBoolean());
				
				
				dis.close();
				fis.close();
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
