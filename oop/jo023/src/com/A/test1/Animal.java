package com.A.test1;

public class Animal {
	public String name;
	public double weight;
	public void Eat() {
		System.out.println("ÕæºÃ³Ô");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Animal(String name,double weight) {
		setName(name);
		setWeight(weight);
	}
}
