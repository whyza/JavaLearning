package com.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class G {

	public static void main(String[] args) {
		File f = new File("D:\\Desktop\\N02\\JA06\\1.txt");
		
		FileOutputStream fos=null;
		try {
			//ÊÇ·ñ×·¼Ó
			fos=new FileOutputStream(f, true);
			
			fos.write(66);
			fos.write(66);
			
			System.out.println("done");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}

}
