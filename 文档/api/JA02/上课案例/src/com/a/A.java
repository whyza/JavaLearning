package com.a;

public class A {

	public A() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("���������������Ǹ�ȥС���ֵĺ�ʱ������");
		//׷������
		sb.append("���ͽ��Ķ���");
		sb.append(3.14);
		//ָ��λ�ò�����ֵ
		sb.insert(6, "!");
		//ɾ��ָ�����ݣ���ͷ����β
		sb.delete(1, 4);
		///ɾ��ָ��λ���ַ�
		sb.deleteCharAt(1);
		//�滻ָ��λ���ַ�
		sb.setCharAt(1, '��');
		
		//��ת˳��
		sb.reverse();
		System.out.println(sb);
	}

}
