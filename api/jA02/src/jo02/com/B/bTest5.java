package jo02.com.B;

public class bTest5 {

	public static void main(String[] args) {
		System.out.println("---------");
		// TODO Auto-generated method stub
		String str = "192.168.1.1";
		String[] arr = str.split("\\.");
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			int a = Integer.parseInt(arr[i]);
			sum  = sum + a;
		}
		System.out.println(sum);	
	}

}
