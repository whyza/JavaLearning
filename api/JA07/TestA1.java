package JA07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestA1 {
	public static void main(String[] args) {
		
		System.out.println("cd\ndir\ntype\n");
		System.out.println("请输入命令-------");
		Scanner sc = new Scanner(System.in);
		String cd = sc.next();
		if (cd.equals("cd")) {
			returnCd();
		}else if(cd.equals("dir")) {
			returnDir();
		}else if(cd.equals("type")) {
			returnType();
		}
		
	}
	public static void returnCd() {
		System.out.println("请输入路径");
		Scanner sc = new Scanner(System.in);
		String cd = sc.next();
		File f = new File(cd);
		System.out.println(f.getPath());
	}
	public static void returnDir() {
		System.out.println("请输入要显示文件路径");
		Scanner sc = new Scanner(System.in);
		String cd = sc.next();
		File f = new File(cd);
		File[] ff = f.listFiles();
		for (File file : ff) {
			System.out.println(file.getName());
		}
		
	}
	public static void returnType() {
		
		System.out.println("请输入要显示文件路径");
		Scanner sc = new Scanner(System.in);
		String cd = sc.next();
		File f = new File(cd);
		try {
			FileInputStream fin  = new FileInputStream(f);
			byte[] b = new byte[(int) f.length()];
			fin.read(b);
			for (byte c : b) {
				System.out.print((char)c);		
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
