package JA06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class TestB3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\new.txt");
		System.out.println(f.exists());
		FileInputStream ff = null;
		try {
			ff = new FileInputStream(f);
			
			byte[] b = new byte[(int)f.length()];
			ff.read(b);
			for (byte byte1 : b) {
				System.out.print((char)byte1);
			}
			
			
			System.out.println("----------------------");
	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ff.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try {
			ff = new FileInputStream(f);
			int n = ff.read();
			while(n != -1) {
				System.out.println((char)n);
				n = ff.read();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				ff.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
