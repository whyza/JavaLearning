package com.a;

public class S {

	public static void main(String[] args) {
		//1-�ַ�������
		
		String str="�������ͺ�ȫ��һ���ˡ�";
		String a="a";
		//�Ƚ��ַ����Ƿ���ȫһ��
		System.out.println("A".equals(a));
		//�Ƚ��ַ����Ƿ���ȣ����Դ�Сд
		System.out.println("A".equalsIgnoreCase(a));
		//�ַ�������
		System.out.println(str.length());
		//����ָ��λ�õ��ַ�
		System.out.println(str.charAt(1)+1);
		//�ҵ�ָ���ַ������ֵ�λ��,�Ҳ�������-1
		str="�������ͺ�ȫ��һ���ˡ���������������";
		System.out.println(str.indexOf("����"));
		//��ĳ��λ�ÿ�ʼ�ҵ�ָ���ַ�����һ�γ��ֵ�λ��
		System.out.println(str.indexOf("����", 3));
		//�ж��ַ����Ƿ��ǿ��ַ���""
		//str="";
		System.out.println(str.isEmpty());
		//
		System.out.println(str.lastIndexOf("����"));
		//�滻ָ���ַ����������䣬�滻�����Ϊ��ֵ����
		str=str.replace("��ȫ", "���ͽ�");
		System.out.println(str);
		//�ж���ʲô��ͷ
		System.out.println(str.startsWith("����"));
		//�ж���ʲô��β
		System.out.println(str.endsWith("@qq.com"));
		str="�������ͺ�ȫ��һ���ˡ���������������";
		//��ָ��λ�ÿ�ʼ��ȡ����󣬰���ָ��λ��
		System.out.println(str.substring(3));
		//�ӿ�ʼλ�ý�ȡ������λ�ã���ͷ����β
		System.out.println(str.substring(3, 5));
		//
		char[] arr=str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}//ȫ����Сд
		System.out.println(str.toLowerCase());
		
		//ȫ����daд
		System.out.println(str.toUpperCase());
		//ͨ��ָ���ַ����ָ�������
		str="��ǰ���¹⣬���ǵ���˪������ͷ�����£���ͷ˼����";
		String[] brr=str.split("��");
		for (int i = 0; i < brr.length; i++) {
			System.out.println(brr[i]+brr[i].isEmpty());
		}
		//ȥ���ַ������˵Ŀո�
		str="admin      ";
		System.out.println(str+"|");
		System.out.println(str.trim()+"|");
		
		System.out.println(str.equals("admin"));
		
		str="  adm i n      ";
		
		System.out.println(str.replace(" ", ""));
	}

}
