package JA06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\1.txt");
//		System.out.println(f.exists());
		try {
			FileOutputStream ff  = new FileOutputStream(f);
			ff = new FileOutputStream(f, true);
			ff.write("Hello".getBytes());
//			ff.write(10);
			ff.write("\n".getBytes());
			ff.write("world".getBytes());
			System.out.println("done");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
	}

}
