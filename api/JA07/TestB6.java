package JA07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class TestB6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("D:\\learning");
		ReturnJava(f);
		
		
	}
	static int count = 0;
	public static void ReturnJava(File f) {
		FileReader fr = null;
		BufferedReader br = null;
		File[] ff  = f.listFiles();
		ArrayList<String> list = new ArrayList<>();
		for (File file : ff) {
			if(file.isFile() && file.getName().endsWith(".java")) {
				count ++;
				System.out.println(file);
				try {
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					String s = "";
					while((s = br.readLine()) != null) {
						list.add(s);
					}
					System.out.println("文件"+file.getName()+"共有"+list.size()+"行");
					
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			if(file.isDirectory()) {
				System.out.println(file);
				ReturnJava(file);
			}
			
		}
		
		System.out.println(count);
		
	}
	
	

}
