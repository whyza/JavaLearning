/*
2  ����һ���ַ����Ķ�ά���飬�������У�����ÿһ��Ԫ��ֵѭ������6���˵���������ʹ��ѭ�������6���˵���������ʽҪ��
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
				System.out.println("������������");
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