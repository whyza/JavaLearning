package jo02.com.B;

public class bTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstString  = "This is";
		String secondString = "This is";
		System.out.println(firstString.equals(secondString));
		System.err.println(firstString==secondString);
		firstString = firstString+" his father";
		System.out.println(firstString);
		firstString = firstString.replaceAll("i", "z");
		System.out.println(firstString);
		System.out.println(firstString.replaceAll(" ", ""));
	}

}
