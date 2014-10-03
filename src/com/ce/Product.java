package com.ce;

public class Product{
	
	public static void main(String[] args) {
		Person[] people = {
			new Person("Mark", "Pig", 18, 180.5, 78, "男"), 
			new Person("Lily", "Dark", 20, 168.4, 45, "女"),
			new Person("Bob", "Know", 45, 170.2, 80, "Man"),
			new Person("Kelly", "Juice", 30, 162.8, 40, "Woman")			
		};
		
		for (Person p : people) {
			System.out.println("FirstName: " + p.getFirstName());
			System.out.println("LastName: " + p.getLastName());
			System.out.println("年齡: " + p.getAge());
			System.out.println("身高: " + p.getHight());
			System.out.println("體重: " + p.getWeight());
			System.out.println("性別: " + p.getGender());
			p.setSalary(10000);
			System.out.println("===========================");
		}
		
	}


}