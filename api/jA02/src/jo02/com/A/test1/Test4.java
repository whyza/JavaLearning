package jo02.com.A.test1;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "what this workbook will do for you the job search process";
		System.out.println("what this workbook will do for you the job search process");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要搜索的关键词---");
		String c = sc.next();
//		char cc = c.charAt(0);
		int count = 0;
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			char[] arrc = arr[i].toCharArray();
			for (int j = 0; j < arrc.length; j++) {
				String s = String.valueOf(arrc[j]);
				if(c.equals(s)) {
					count++;
				}	
			}
			if(count != 0 ) {
				System.out.print(arr[i]);
				System.out.print("---"+count+"\t");
			}		
			count=0;
		}		
	}
}
