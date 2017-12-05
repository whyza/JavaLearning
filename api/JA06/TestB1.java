package JA06;

import java.io.File;
import java.io.IOException;

public class TestB1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\2.txt");
		try {
			System.out.println(f.createNewFile());
			System.out.println(f.length()+" byte");
			System.out.println(f.isDirectory());
			System.out.println(f.isFile());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File ff =  new File("D:\\Hexo");
		File[] f1 = ff.listFiles();
		for (File file : f1) {
			System.out.println(file);
		}
	}


}
