package com.test6;
/*��ϰ6: ���Ե�Ӧ��
����һ��Car��(�γ���)��Ϊ�䶨��x�������꣩��y�������꣩��dir������ֵΪ�������ң���type��Ʒ�ƣ�4���ֶΣ���������η���Ϊ˽�У�
ΪCar�ඨ��һ�����췽��ʵ��4���ֶεĳ�ʼ��
ΪCar���4���ֶζ������ԣ�Ҫ��Ժ��������Ժ�����������У�����0С��200����������У��ֻ�����ϻ��»�����ң�Ʒ��������У��
����һ��Car����ͨ�����췽��������������ʼΪ10���������ʼΪ50�������ʼΪ�ң�Ʒ�Ƴ�ʼΪ��
ͨ��Car����ĺ������������¸������긳ֵΪ��20����ͨ��Car�����Ʒ���������¸�Ʒ�Ƹ�ֵΪ������
ͨ��Car����ĸ������Խ��ö���Ļ�����Ϣ��ӡ��������
*/
public class Car {
	private int x;
	private int y;
	private char dir;
	private String type;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		if(x>0 && x<200) {
			this.x = x;
		}else {
			this.x = 100;
		}

	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		if(y>0 && y<200) {
			this.y = y;
		}else {
			this.y = 100;
		}
	}
	public int getDir() {
		return dir;
	}
	public void setDir(char dir) {
		if(dir=='��' || dir=='��' || dir=='��'||dir=='��') {
			this.dir = dir;
		}else {
			this.dir='��';
		}

	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Car() {
		setX(10);
		setY(50);
		setDir('��');
		setType("��");
	}

	public void ShowData() {
		System.out.println("�����꣺"+x+"������:"+y+"����"+dir+"Ʒ�ƣ�"+type);
	}
	
	
}
