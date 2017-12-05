package JA06;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestB4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\1.txt");
		FileOutputStream ff = null;
		try {
			ff =  new FileOutputStream(f,true);
			ff.write("hh".getBytes());
			System.out.println("done");
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
