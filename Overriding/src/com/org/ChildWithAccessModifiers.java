package com.org;

public class ChildWithAccessModifiers extends Child{
	
	public void method() {
		System.out.println(this.getClass().getSimpleName());
	}

}
