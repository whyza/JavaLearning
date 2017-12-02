package com.C;
/*练习1：
	题目一
a)	定义一个Human类(人类)，为其定义name（名字），age（年龄），sex（性别）height（身高）4个字段，其访问修饰符均为public；
b)	在Main中创建一个名字为小芳，年龄为21，身高为1.65，性别为女的人类对象
c)	在Main中打印该对象的基本信息,格式如下:xx名,年龄:xxx,身高:xxx,性别:xxx
题目二
d)	定义一个电脑类(Computer),为其定义type(品牌),size(尺寸),cpu(cpu大小)
memory(内存大小),yp(硬盘大小),访问修饰符全为public
e)	为该电脑类定义一个方法ShowData(),用来打印该电脑基本信息,格式如下:
品牌为:xxx,尺寸为:xxx,cpu大小为:xxx,内存大小为:xxx,硬盘大小为:xxx
f)	在Main方法内创建一个电脑对象,分别赋值为:
宏基,1.41(尺寸),2(cpu),2(内存),200(硬盘)
g)	调用该电脑对象的ShowData()方法，打印其基本资料
 
  */
public class Human {
	public String name;
	public int age;
	public char sex;
	public double height;
	public void Show() {
		System.out.println("名字："+name+"\t"+"年龄:"+age+"\t"+"性别:"+sex);
	}
}
