package jo02.com.A.test1;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "helloWorldIamBiegral";
		char[] arr = str.toCharArray();
		int j = 0;
		int index = 0;
		int count = 0;
		String[] aa = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (Character.isUpperCase(arr[i])) {
				j = i;
				aa[i] = str.substring(index, j);
				System.out.println(aa[i]+i);
				index = j;
			}
		}
		aa[count] = str.substring(index, str.length());
		System.out.println(aa[count]);
		for (int i = 0; i < aa.length; i++) {
			System.out.println(aa[i]);
		}
	}

}
