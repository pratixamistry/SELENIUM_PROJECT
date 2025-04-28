package com.junit;

public class Arithmetic_Example {

	
	//method with out test annotation because this class methods can be clled from 
	// another class
	
	public void getException(int x, int y) {
		System.out.println("in getException method");
		System.out.println("ans is: "+x/y);
		System.out.println("your division is successful...");
		System.out.println("your program is completed!!!");
	}
}
