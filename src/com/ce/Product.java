package com.ce;


public class Product{
	private int id;
	private final static int PI = 10;
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public static void main(String[] args) {
		Product pt = new Product();
		
		pt.setId(50);
		System.out.println(pt.getId());
	}


}