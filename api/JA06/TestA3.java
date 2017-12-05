package JA06;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\1.txt");
		
		FileInputStream ff = null;
		byte[] arr = new byte[(int) f.length()];
		try {
			ff = new FileInputStream(f);
			ff.read(arr);
			for (byte b : arr) {
				System.out.print((char)b);
			}
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
