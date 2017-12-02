import java.util.Scanner;
class B4 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[4];
		for(int i=0;i<arr.length;i++){
			System.out.println("ÇëÊäÈë×Ö·û´®");
			String str = sc.next();
			arr[i]=str;	
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}
}
