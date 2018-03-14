package com.b;

import java.util.Random;

public class Stu {

	// -添加属性----定义一个变量
	String name;
	int age;
	char sex;

	// 添加方法
	public void FD() {
		System.out.println(name + "在默默的发呆……%");
	}

	/**
	 * 问父母要生活费
	 * 
	 * @param m
	 *            父母给的钱数
	 */
	public void YSHF(int m) {
		if (m >= 5000) {
			System.out.println(name + "天天下馆子");
		} else if (m >= 2000) {
			System.out.println(name + "偶尔下一次馆子");
		} else if (m >= 1000) {
			System.out.println(name + "天天吃食堂，一定是丰泽三楼……");
		} else if (m >= 100) {
			System.out.println(name + "天天吃米饭拌老干妈");
		} else {
			System.out.println(name + "已饿死……");
		}
	}
	/**
	 * 帮别人拿快递
	 * @return 拿回来的快递
	 */
	public String NKD(){
		Random r=new Random();
		if(r.nextInt(100)<40){
			return "快递小哥是个SB";
		}else{
			return "你的快递";
		}
		
	}
	/**
	 * 帮人买烟
	 * @param m 钱
	 * @return 烟
	 */
	public String MY(int m){
		if(m>=1000){
			return name+"携款逃跑";
		}else if(m>=500){
			return "和天下";
		}else if(m>=100){
			return "芙蓉王";
		}else{
			return "软白沙";
		}
		
	}
	
	
	public boolean Love(Stu stu){
		if(sex==stu.sex){
			return false;
		}else{
			return true;
		}
		
	}
	
	
	
	
}
