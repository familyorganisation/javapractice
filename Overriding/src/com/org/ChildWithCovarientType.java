package com.org;

public class ChildWithCovarientType extends Parent{
	
	public Parent2 anotherMethod() {
		System.out.println(this.getClass().getSimpleName());
		
		return new Parent2();
	}

}
