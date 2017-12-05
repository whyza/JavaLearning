package JA07;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f= new File("D:\\1.txt");
		FileWriter fw = null;
		try {
			fw =new FileWriter(f, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Ð¡Ñù£¬Äã»µ»µ£¡£¡£¡");
			
			bw.close();
			fw.close();
			System.out.println("done");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
