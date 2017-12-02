package com.test6;
/*练习6: 属性的应用
定义一个Car类(轿车类)，为其定义x（横坐标），y（纵坐标），dir（方向：值为上下左右），type（品牌）4个字段，其访问修饰符均为私有；
为Car类定义一个构造方法实现4个字段的初始化
为Car类的4个字段定义属性，要求对横坐标属性和纵坐标属性校验大于0小于200，方向属性校验只能是上或下或左或右，品牌属性无校验
创建一个Car对象，通过构造方法将对象横坐标初始为10，纵坐标初始为50，方向初始为右，品牌初始为虎
通过Car对象的横坐标属性重新给横坐标赋值为”20”，通过Car对象的品牌属性重新给品牌赋值为”宝马”
通过Car对象的各个属性将该对象的基本信息打印各个出来
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
		if(dir=='上' || dir=='下' || dir=='左'||dir=='右') {
			this.dir = dir;
		}else {
			this.dir='上';
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
		setDir('右');
		setType("虎");
	}

	public void ShowData() {
		System.out.println("横坐标："+x+"纵坐标:"+y+"方向："+dir+"品牌："+type);
	}
	
	
}
