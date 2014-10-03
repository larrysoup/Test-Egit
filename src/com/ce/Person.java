package com.ce;

public class Person {
	private String nickName;
	private int age;
	private double hight;
	private int weight;
	private String gender;
	
	Person(String name, int age, double hight, int weight, String gender) {
		this.nickName = name;
		this.age = age;
		this.hight = hight;
		this.weight = weight;
		this.gender = gender;
	}
	
	public String getName() {
		return nickName;
	}
	public void setName(String name) {
		this.nickName = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHight() {
		return hight;
	}
	public void setHight(double hight) {
		this.hight = hight;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
