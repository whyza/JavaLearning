import java.util.Scanner;
class  A5
{
	public static void main(String[] args) 
	{
		String an = "";
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=100;i++){
			System.out.println("�Ұ��㣬�㰮����");	
			an = sc.next();
			if("ϲ��".equals(an)){
				break;
			}
		}	
	}
}
