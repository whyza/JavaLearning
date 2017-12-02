package com.test2;
/*练习2：
1)	创建一个狗类:Dog
2)	为狗类添加一个公有的name字段和sex字段
3)	为Dog添加ShowData方法，打印它的名字和性别
4)	为Dog添加Love方法，bool Love(Dog d)实现找对象功能，返回bool值：是否谈成功，条件:(如果传进来的狗是公的，那么当前狗必须是母的，如果传进来的狗是母的,当前狗必须是公的
5)	为Dog添加YaoRen方法,实现狗咬人功能,void YaoRen(string str),如果参数数str是
”男人”， 输出“唬唬”,如果str是一个”女人”，输出“喔喔”，如果str是其它的输出”哇哇”

*/
public class Dog {
	public String name;
	public char sex;
	public void ShowData() {
		System.out.println("名字："+name+"\t性别:"+sex);
	}
	public boolean Love(Dog d) {
		if(d.sex!=sex) {
			System.out.println("配对成功");
			return true;		
		}else {
			System.out.println("配对失败");
			return false;
		}
	}	
	public void YaoRen(String str) {
		if("男人".equals(str)) {
			System.out.println("唬唬");
		}else if("女人".equals(str)) {
			System.out.println("喔喔");
		}else {
			System.out.println("哇哇");
		}
	}
	

}
