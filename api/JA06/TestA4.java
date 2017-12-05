package JA06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestA4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\1.txt");
		File f2 = new File("D:\\1a.txt");
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			System.out.println(f2.createNewFile());
			fin = new FileInputStream(f);
			fout = new FileOutputStream(f2);
			byte[] b = new byte[(int)f.length()];
			fin.read(b);
			for (byte c : b) {
				System.out.println((char)c);
				fout.write((char)c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fin.close();
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
