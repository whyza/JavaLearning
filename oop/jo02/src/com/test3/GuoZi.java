package com.test3;
/*��ϰ3����
	4.1 ����һ����ѹ¯����:GuoZi
	4.2 Ϊ��GuoZi����������������ֱ�Ϊ:
		1)�󷹵ķ���:public string GetFan(int wan){};
          ����wan��ʾ���������,����ֵΪ:��������������ظ������������뷹
		  ������:10���ף�����20�뷹
		2)�����ķ���:public string GetTang(string caiName){};
		  ����:caiName��ʾ��Ĳ���,����ֵΪ:һ��xxx��
4.3 ��Main�����д���һ����ѹ¯������:lg
	4.4 ��Main�����е��ø�lg�����GetFan(10),����ӡ����
	4.5 ��Main�����е��ø�lg�����GetTang(���ײˡ�),����ӡ����
*/
public class GuoZi {
	public String GetFan(int wan){
		int fan = wan*2;
		return fan+"�뷹";	
	}
	public String GetTang(String caiName){
		return "һ��"+caiName+"��";
	}
}
