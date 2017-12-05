package JA03;

import java.util.Calendar;
import java.util.Scanner;

public class JO03A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println(c.get(Calendar.MONTH));   //10
		Scanner sc = new Scanner(System.in);
		System.out.println("输入年份");
		int year = sc.nextInt();
		System.out.println("输入月份");
		int month = sc.nextInt();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.MONTH, month-1);
		c.set(Calendar.DATE, 1);
		System.out.println(c.get(Calendar.MONTH));
		int kgNum = c.get(Calendar.DAY_OF_WEEK)-2;
		if(kgNum==-1) {
			kgNum = 6;
		}
		System.out.println(kgNum);
		System.out.println("一\t二\t三\t四\t五\t六\t日");
		for (int i = 1; i <= kgNum; i++) {
			System.out.print("--"+"\t");
		}
		int days = 	c.getActualMaximum(Calendar.DAY_OF_MONTH);
		for (int i = 1; i <= days; i++) {
			System.out.print(i+"\t");
			if((i+kgNum)%7==0) {
				System.out.println();
			}
		}
	}

}
