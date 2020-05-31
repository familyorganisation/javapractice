package com.org;

public class Child extends Parent{
	
	public void method() {
		System.out.println(this.getClass().getSimpleName());
	}

}
