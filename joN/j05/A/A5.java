import java.util.Scanner;
class  A5
{
	public static void main(String[] args) 
	{
		System.out.println("�������ַ���1");
		String str = "";
		String s = "";
		Scanner sc = new Scanner(System.in);
		int count = 2;
		str = sc.next();
		while(!"Esc".equals(str)){
			System.out.println("�������ַ���"+count+",����'Esc'�˳�");
			str = sc.next();
			count++;
			if("Esc".equals(str)){		
				break;
			}else{
				s = s + str;
			}
		}
		System.out.println(s);
	}
}