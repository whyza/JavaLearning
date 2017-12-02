package com.test4;
/*练习4：人吃水果
	5.1 请创建一个水果类Fruit,为该类提供两个公有的字段:name(水果名),wd(味道)
	5.1 请创建一个人类Person,为该人类提供一个公有的字段:name用来表示人的姓名
	5.2 为人类Person添加一个Eat方法,传入一个水果，并在方法内打印该人正在干什么
	Eat方法:  public void Eat(Fruit f){ }
	如果传进的水果为:桔子,酸酸的,即在人的Eat方法打印:xxx正在吃一个酸酸的桔子
 5.3 在Main方法中创建一个人对象p,为该人取名为:哈利油
 5.4 在Main方法中创建一个水果对象f,水果名为:桔子,味道:酸酸的
 5.5 调用p对象的Eat方法并传入f，查看其结果
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
