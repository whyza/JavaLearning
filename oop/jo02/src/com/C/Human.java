package com.C;
/*��ϰ1��
	��Ŀһ
a)	����һ��Human��(����)��Ϊ�䶨��name�����֣���age�����䣩��sex���Ա�height����ߣ�4���ֶΣ���������η���Ϊpublic��
b)	��Main�д���һ������ΪС��������Ϊ21�����Ϊ1.65���Ա�ΪŮ���������
c)	��Main�д�ӡ�ö���Ļ�����Ϣ,��ʽ����:xx��,����:xxx,���:xxx,�Ա�:xxx
��Ŀ��
d)	����һ��������(Computer),Ϊ�䶨��type(Ʒ��),size(�ߴ�),cpu(cpu��С)
memory(�ڴ��С),yp(Ӳ�̴�С),�������η�ȫΪpublic
e)	Ϊ�õ����ඨ��һ������ShowData(),������ӡ�õ��Ի�����Ϣ,��ʽ����:
Ʒ��Ϊ:xxx,�ߴ�Ϊ:xxx,cpu��СΪ:xxx,�ڴ��СΪ:xxx,Ӳ�̴�СΪ:xxx
f)	��Main�����ڴ���һ�����Զ���,�ֱ�ֵΪ:
���,1.41(�ߴ�),2(cpu),2(�ڴ�),200(Ӳ��)
g)	���øõ��Զ����ShowData()��������ӡ���������
 
  */
public class Human {
	public String name;
	public int age;
	public char sex;
	public double height;
	public void Show() {
		System.out.println("���֣�"+name+"\t"+"����:"+age+"\t"+"�Ա�:"+sex);
	}
}
