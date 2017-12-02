import java.util.Scanner;
class  A5
{
	public static void main(String[] args) 
	{
		String an = "";
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<=100;i++){
			System.out.println("ÎÒ°®Äã£¬Äã°®ÎÒÂð£¿");	
			an = sc.next();
			if("Ï²»¶".equals(an)){
				break;
			}
		}	
	}
}
