/*
2  定义一个字符串的二维数组，三行两列，数组每一个元素值循环输入6个人的姓名，再使用循环输出这6个人的姓名。格式要求：
	XXX	XXX    
	XXX	XXX    
	XXX	XXX
*/
import java.util.Scanner;
class A2 
{
	public static void main(String[] args) 
	{
		String[][] arr = new String[3][2];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println("请输入姓名：");
				String an = sc.next();
				arr[i][j] = an;
			}
		}
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
