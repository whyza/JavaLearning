/*����һ������ж��Ƿ�������
*/
import java.util.Scanner;
class  A
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("���������");
		int year=in.nextInt();
		if(year%4==0&&year%100!=0 || year%400==0){
			System.out.println(year+"������");
		}else{
			System.out.println(year+"��ping��");
		}





	}
}
