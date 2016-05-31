package com.ashish.sample;

class SuperClass{
	
	public SuperClass(String name){
		System.out.println("Super Class...");
	}
	
	public SuperClass(){
		System.out.println("default Super Class...");
	}
}


public class BaseClass extends SuperClass{
	
	public BaseClass(String name) {
		super();
		System.out.println("Base Class...");
	}
	
	
	public static void main(String[] args) {

		BaseClass obj = new BaseClass("Ashish");
		
	}

}
