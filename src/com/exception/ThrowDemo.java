package com.exception;

public class ThrowDemo {
	public static void main (String [] args) {
		int age=18;
		if (age < 18) {
			throw new ArithmeticException ("Acess denied - you must be at least 18 years old ");
		}
		else {
			System.out.println("acess granted");

}
		
}
}

// throw keyword is help to throw custom error 

/*The throw statement allows you to create a custom error.

The throw statement is used together with an exception type. There are many exception types available in Java: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:
*/