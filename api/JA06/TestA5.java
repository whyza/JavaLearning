package JA06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\1.jpg");
		File f2 = new File("D:\\new2.jpg");
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream(f);
			fout = new FileOutputStream(f2);
			System.out.println(f2.createNewFile());
			byte[] b = new byte[(int) f.length()];
			fin.read(b);
			for (byte c : b) {
				fout.write(c);
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
