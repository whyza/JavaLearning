package com.test3;
/*练习3：煮饭
	4.1 定义一个高压炉锅类:GuoZi
	4.2 为该GuoZi类添加两个方法，分别为:
		1)煮饭的方法:public string GetFan(int wan){};
          参数wan表示煮多少碗米,返回值为:根据煮的碗数返回该两倍数量的碗饭
		  比如煮:10碗米，返回20碗饭
		2)煮汤的方法:public string GetTang(string caiName){};
		  参数:caiName表示煮的菜名,返回值为:一盆xxx汤
4.3 在Main方法中创建一个高压炉锅对象:lg
	4.4 在Main方法中调用该lg对象的GetFan(10),并打印其结果
	4.5 在Main方法中调用该lg对象的GetTang(“白菜”),并打印其结果
*/
public class GuoZi {
	public String GetFan(int wan){
		int fan = wan*2;
		return fan+"碗饭";	
	}
	public String GetTang(String caiName){
		return "一盆"+caiName+"汤";
	}
}
