package com.polymorphism;

import com.javabasics.Methods;

public class MethodOverloading {
	public void addition (int number1, int number2) {
		
		System.out.println(number1+number2);
		
}
	public void addition (double number1,double number2) {
		System.out.println(number1+number2);
	}
	public static void main (String[] args) {
		MethodOverloading obj=new MethodOverloading ();
		obj.addition(5, 9);
		obj.addition(5.2, 9.2);
		
		
}
}

/*
 * There are two ways to overload the method in java

By changing number of arguments
By changing the data type
 */


	//method overloading, multiple methods can have the same name with different parameters
	