package com.org;

import java.io.IOException;

public class Parent {

	public void method() throws IOException {
		System.out.println(this.getClass().getSimpleName());
	}

	public static void otherMethod() {
		System.out.println(Parent.class.getSimpleName());
	}

	public Parent1 anotherMethod() {

		System.out.println(this.getClass().getSimpleName());

		return new Parent1();

	}

}
