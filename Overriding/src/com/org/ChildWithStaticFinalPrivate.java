package com.org;

public class ChildWithStaticFinalPrivate extends Parent {
	
	
	public static void otherMethod () {
		System.out.println(ChildWithStaticFinalPrivate.class.getSimpleName());
	}

}
