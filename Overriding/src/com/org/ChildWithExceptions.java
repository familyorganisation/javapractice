package com.org;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ChildWithExceptions extends Parent{
	
	public void method()  throws FileNotFoundException{
		System.out.println(this.getClass().getSimpleName());
	}

}
