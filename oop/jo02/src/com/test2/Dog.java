package com.test2;
/*��ϰ2��
1)	����һ������:Dog
2)	Ϊ�������һ�����е�name�ֶκ�sex�ֶ�
3)	ΪDog���ShowData��������ӡ�������ֺ��Ա�
4)	ΪDog���Love������bool Love(Dog d)ʵ���Ҷ����ܣ�����boolֵ���Ƿ�̸�ɹ�������:(����������Ĺ��ǹ��ģ���ô��ǰ��������ĸ�ģ�����������Ĺ���ĸ��,��ǰ�������ǹ���
5)	ΪDog���YaoRen����,ʵ�ֹ�ҧ�˹���,void YaoRen(string str),���������str��
�����ˡ��� �����������,���str��һ����Ů�ˡ���������ม������str����������������ۡ�

*/
public class Dog {
	public String name;
	public char sex;
	public void ShowData() {
		System.out.println("���֣�"+name+"\t�Ա�:"+sex);
	}
	public boolean Love(Dog d) {
		if(d.sex!=sex) {
			System.out.println("��Գɹ�");
			return true;		
		}else {
			System.out.println("���ʧ��");
			return false;
		}
	}	
	public void YaoRen(String str) {
		if("����".equals(str)) {
			System.out.println("����");
		}else if("Ů��".equals(str)) {
			System.out.println("��");
		}else {
			System.out.println("����");
		}
	}
	

}
