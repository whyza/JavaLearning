import java.util.Scanner;
class B6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String an="";
		String u="";
		while(true){
			System.out.println("������---");
			an=sc.next();
			u+=an;	
			if("exit".equals(an)){
				break;
			}
		}
			System.out.println(u);
	}
}
