package com.hw.a;

public class T {

	/*
	 * 
	 * ��ϰ4���˳�ˮ��
	5.1 �봴��һ��ˮ����Fruit,Ϊ�����ṩ�������е��ֶ�:name(ˮ����),wd(ζ��)
	5.1 �봴��һ������Person,Ϊ�������ṩһ�����е��ֶ�:name������ʾ�˵�����
	5.2 Ϊ����Person���һ��Eat����,����һ��ˮ�������ڷ����ڴ�ӡ�������ڸ�ʲô
	Eat����:  public void Eat(Fruit f){ }
	���������ˮ��Ϊ:����,�����,�����˵�Eat������ӡ:xxx���ڳ�һ������Ľ���
 5.3 ��Main�����д���һ���˶���p,Ϊ����ȡ��Ϊ:������
 5.4 ��Main�����д���һ��ˮ������f,ˮ����Ϊ:����,ζ��:�����
 5.5 ����p�����Eat����������f���鿴����

	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p=new Person();
		p.name="������";
		
		Fruit f=new Fruit();
		f.name="����";
		f.wd="����";
		
		p.Eat(f);
	}

}
