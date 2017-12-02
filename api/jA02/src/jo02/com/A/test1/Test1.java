package jo02.com.A.test1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.err.println("请输入一个字符串---------");
		String str  = sc.next();
		char[] arr = str.toCharArray();
		int FZM = 0;
		int DXZM = 0;
		int XXZM = 0;
		int SZ = 0;
		for (int i = 0; i < arr.length; i++) {
			if(Character.isLowerCase(arr[i])) {
				XXZM++;
			}
			if(Character.isUpperCase(arr[i])) {
				DXZM++;
			}
			if(Character.isDigit(arr[i])) {
				SZ++;
			}
			if(!Character.isLetter(arr[i])) {
				FZM++;
			}
			
		}
		System.out.println("非字母数："+FZM+"个\t大写字母："+DXZM+"个\t小写字母："+XXZM+"个数字："+SZ+"个");
	}

}
