package com.test5;
/*��ϰ5:���Ե�Ӧ��
1)	����һ����ʦ��:Teacher
2)	Ϊ��ʦ����ֶ�:id,name,sex,age,height
3)	�ֱ�Ϊ�ֶ���Ӷ�Ӧ������:
id:int���� 
name:string�����ȴ���һλ������λ
sex:string��ֻ�����к�Ů
age:int��ֻ����20-55֮��
height:double��ֻ����1.50-1.80֮��
4)	����һ��ShowData��������ӡ��š��������Ա����
5)	��Main�����д���һ����ʦ���󣬷ֱ�ͨ����������Ϊ�����ֶθ�ֵ���ٵ��øö����ShowData���������п�����
*/
public class Teacher {
		int id ;
		String name;
		char sex;
		int age;
		double height;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			if(name.length()<4 && name.length()>1) {
				this.name = name;
			}else {
				name="ls";
			}

		}
		public char getSex() {
			return sex;
		}
		public void setSex(char sex) {
			if(sex=='��') {
				this.sex='��';
			}else{
				this.sex='Ů';
			}
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public double getHeight() {
			return height;
		}
		public void setHeight(double height) {
			if(height > 1.50 && height <1.80) {
				this.height = height;
			}else{
				this.height=1.50;
			}
		}
		public void ShowData() {
			System.out.println("��ţ�"+id+"\t"+"������"+name+"\t"+"�Ա�"+sex+"\t"+"��ߣ�"+height);
		}
		
}
