package com.javabasics;

public class OperatorsDemo {
	
	public static void main(String[] args) {   //This is a main method 
	int a=20;
	int b=10;
	 int   d=a+b;
	System.out.println(d);
	int c=a%b;
	System.out.println(c);
	
	
	int e=4;              // its means passing the variable 
	int f=4;
	
	// ARITHMATIC OPERATORS
	System.out.println(e+f);// for addition
	System.out.println(e-f);// for substraction
	System.out.println(e*f);//for multiplication
	System.out.println(e/f);//for division
	
	System.out.println(--e);//This is pre decrement, output is 3
	System.out.println(f--);//This is post decrement,output is 4
	
	
	System.out.println(++e);// This is pre increment
	System.out.println(f++);//This is post increment
    System.out.println(f);// for finding value of f
    System.out.println(e);// for finding value of e
    
    // JAVA COMPARISON OPERATORS
    System.out.println(e==f);// for equal to
    System.out.println(e!=f);// for not equal
    System.out.println(e>f);//  for greater than
    System.out.println(e<f);//  for less than
    System.out.println(e>=f);// use for greater than equal to
    System.out.println(e<=f);// use for less than equal to
    
    
    // LOGICAL OPERATORS
    System.out.println(e<4 && e>1);// Logical AND operator....... when both statment true its TRUE
    System.out.println(f<4 || e>1);// Logical OR operator ........ if only one statment true its TRUE
    System.out.println(!(f<4 || e>1));// Logical NOT operator........ if result is true then it false ... REVERS OF RESULT
    
    
    
}
}

// Homework- addition,substraction, multi,div, decrement

/*arithmatic operations
Arithmetic operators
Assignment operators
Comparison operators
Logical operators
*/

/*Arithmetic operators

+    Addition	    Adds together two values	            x + y	
-	Subtraction	    Subtracts one value from another	    x - y	
*	Multiplication  Multiplies two values	                x * y	
/	Division	    Divides one value by another	        x / y	
%	Modulus	        Returns the division remainder	        x % y	
++	Increment	    Increases the value of a variable by 1	 ++x	
--	Decrement	    Decreases the value of a variable by 1	 --x	

/*Java Comparison Operators
	
	Operator	Name	Example	
	==	Equal to	x == y	
	!=	Not equal	x != y	
	>	Greater than	x > y	
	<	Less than	x < y	
	>=	Greater than or equal to	x >= y	
	<=	Less than or equal to	x <= y
	*/

/*Java Logical Operators

Operator	Name				Description									Example	
&& 			Logical and		Returns true if both statements are true	x < 5 &&  x < 10	
|| 			Logical or		Returns true if one of the statements is true	x < 5 || x < 4	
!			Logical not		Reverse the result, returns false if the result is true	!(x < 5 && x < 10)	
*/