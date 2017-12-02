package jo02.com.B;

public class bTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Call Me GEEK";
		System.out.println("字符串长度为：" + s.length());
		System.out.println(s.indexOf("l"));
		System.out.println(s.lastIndexOf("l"));
		System.out.println(s.substring(0, 3));
		char[] c = s.toCharArray();
		System.out.println("------------------");
		for (int i = 0; i < c.length; i++) {
			if (Character.isUpperCase(c[i])) {
				System.out.print("大写字母有：" + c[i] + "\t");
			}
		}
		System.out.println();

		// CharAt
		System.out.println("CharAt()方法");
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
//			System.out.println(c1);
			if (Character.isUpperCase(c1)) {
				System.out.print("大写字母有：" + c1 + "\t");
			}

		}
		
		System.out.println();
		
//		StringBuffer
		
		StringBuffer sb = new StringBuffer("Call Me GEEK");	
		//删除ME
		sb.delete(4, 7);
		System.out.println(sb);
		//添加Group
		sb.append(" Group");
		System.out.println(sb);
		
	}
}
