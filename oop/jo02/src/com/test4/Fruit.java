package com.test4;
/*��ϰ4���˳�ˮ��
	5.1 �봴��һ��ˮ����Fruit,Ϊ�����ṩ�������е��ֶ�:name(ˮ����),wd(ζ��)
	5.1 �봴��һ������Person,Ϊ�������ṩһ�����е��ֶ�:name������ʾ�˵�����
	5.2 Ϊ����Person���һ��Eat����,����һ��ˮ�������ڷ����ڴ�ӡ�������ڸ�ʲô
	Eat����:  public void Eat(Fruit f){ }
	���������ˮ��Ϊ:����,�����,�����˵�Eat������ӡ:xxx���ڳ�һ������Ľ���
 5.3 ��Main�����д���һ���˶���p,Ϊ����ȡ��Ϊ:������
 5.4 ��Main�����д���һ��ˮ������f,ˮ����Ϊ:����,ζ��:�����
 5.5 ����p�����Eat����������f���鿴����
*/
public class Fruit {
	public String name;
	public String wd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWd() {
		return wd;
	}
	public void setWd(String wd) {
		this.wd = wd;
	}	
}
