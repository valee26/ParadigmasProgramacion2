package com.pp2;

public class persona {
	protected int age;
	protected String name;
	
	public persona () {
	
	}
	
	public persona (int age, String name) {
		this.age =age;
	this.name=name;
	}
	public int getAge() {
		return age ;
		
	}

	public void setAge() {
		this.age =age;
		
	}
	public String getName () {
		return name;
	}
	public void setName (String name) {
		this.name =name;
	}
	protected void showAge() {
		System.out.println( "Age is " + age);
	}
}
