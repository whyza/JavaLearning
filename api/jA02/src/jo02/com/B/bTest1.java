package jo02.com.B;

public class bTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Call Me GEEK";
		System.out.println("�ַ�������Ϊ��" + s.length());
		System.out.println(s.indexOf("l"));
		System.out.println(s.lastIndexOf("l"));
		System.out.println(s.substring(0, 3));
		char[] c = s.toCharArray();
		System.out.println("------------------");
		for (int i = 0; i < c.length; i++) {
			if (Character.isUpperCase(c[i])) {
				System.out.print("��д��ĸ�У�" + c[i] + "\t");
			}
		}
		System.out.println();

		// CharAt
		System.out.println("CharAt()����");
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
//			System.out.println(c1);
			if (Character.isUpperCase(c1)) {
				System.out.print("��д��ĸ�У�" + c1 + "\t");
			}

		}
		
		System.out.println();
		
//		StringBuffer
		
		StringBuffer sb = new StringBuffer("Call Me GEEK");	
		//ɾ��ME
		sb.delete(4, 7);
		System.out.println(sb);
		//���Group
		sb.append(" Group");
		System.out.println(sb);
		
	}
}
