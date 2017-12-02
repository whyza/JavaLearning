package com.test5;
/*练习5:属性的应用
1)	创建一个老师类:Teacher
2)	为老师添加字段:id,name,sex,age,height
3)	分别为字段添加对应的属性:
id:int类型 
name:string，长度大于一位少于四位
sex:string，只能是男和女
age:int，只能在20-55之间
height:double，只能在1.50-1.80之间
4)	定义一个ShowData方法，打印编号、姓名、性别、身高
5)	在Main方法中创建一个老师对象，分别通过各个属性为各个字段赋值，再调用该对象的ShowData方法，运行看其结果
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
			if(sex=='男') {
				this.sex='男';
			}else{
				this.sex='女';
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
			System.out.println("编号："+id+"\t"+"姓名："+name+"\t"+"性别："+sex+"\t"+"身高："+height);
		}
		
}
