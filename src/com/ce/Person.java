package com.ce;

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private double hight;
	private int weight;
	private String gender;
	
	Person(String firstName, String lastName, int age, double hight, int weight, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.hight = hight;
		this.weight = weight;
		this.gender = gender;
	}
	
	public String getName() {
		return firstName;
	}
	
	public void setName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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
