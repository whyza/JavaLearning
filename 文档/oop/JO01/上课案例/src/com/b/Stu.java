package com.b;

import java.util.Random;

public class Stu {

	// -�������----����һ������
	String name;
	int age;
	char sex;

	// ��ӷ���
	public void FD() {
		System.out.println(name + "��ĬĬ�ķ�������%");
	}

	/**
	 * �ʸ�ĸҪ�����
	 * 
	 * @param m
	 *            ��ĸ����Ǯ��
	 */
	public void YSHF(int m) {
		if (m >= 5000) {
			System.out.println(name + "�����¹���");
		} else if (m >= 2000) {
			System.out.println(name + "ż����һ�ι���");
		} else if (m >= 1000) {
			System.out.println(name + "�����ʳ�ã�һ���Ƿ�����¥����");
		} else if (m >= 100) {
			System.out.println(name + "������׷����ϸ���");
		} else {
			System.out.println(name + "�Ѷ�������");
		}
	}
	/**
	 * ������ÿ��
	 * @return �û����Ŀ��
	 */
	public String NKD(){
		Random r=new Random();
		if(r.nextInt(100)<40){
			return "���С���Ǹ�SB";
		}else{
			return "��Ŀ��";
		}
		
	}
	/**
	 * ��������
	 * @param m Ǯ
	 * @return ��
	 */
	public String MY(int m){
		if(m>=1000){
			return name+"Я������";
		}else if(m>=500){
			return "������";
		}else if(m>=100){
			return "ܽ����";
		}else{
			return "���ɳ";
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
