package com.ashish.sample;

class Parent {

	private int par;
	public int a;
	static public String name;

	public Parent() {
		System.out.println("Parent...");
		name = "Karthik";
	}
}

public class ConstDemo extends Parent {

	public ConstDemo() {
		name = "Ashish";
	}

	public static void main(String[] args) {
		// System.out.println(name);
		Parent child = new ConstDemo();
		System.out.println("Name : "  + name);
	}
}
