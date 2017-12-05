package JA06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestB5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\new.txt");
		File f1 = new File("D:\\new2.txt");
		FileInputStream ff = null;
		FileOutputStream fout = null;
		try {
			ff = new FileInputStream(f);
			fout = new FileOutputStream(f1);
			System.out.println(f.createNewFile());
			byte[] b =new byte[(int) f.length()];
			ff.read(b);
			for (byte c : b) {
				fout.write(c);
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				fout.close();
				ff.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
