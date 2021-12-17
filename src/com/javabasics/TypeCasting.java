package com.javabasics;

public class TypeCasting {
public static void main (String [] args) {
	int mynum1=10;
	//need to convert int to double ( its a task )
	double mynum2=mynum1;
	System.out.println (mynum1);
	System.out.println (mynum2);
	//convert short to float
	short mynum3=3102;
	float mynum4=mynum3;
	System.out.println (mynum3);
	System.out.println (mynum4);
	//double to int 
	double mynum5=10.660;
	int mynum6=(int)mynum5;
	System.out.println(mynum5);
	System.out.println(mynum6);
	//float to short
	float mynum7=51.0F;
	short mynum8=(short)mynum7;
	System.out.println(mynum7);
	System.out.println(mynum8);
	//short to char this is exceptional we should use narrowing casting
	Short mynum9=65;
	//char mynum10=(char)mynum9;
	System.out.println(mynum9);
	//System.out.println(mynum10);

	
}
}
/*
Widening Casting (automatically) - converting a smaller type to a larger type size--implicit type casting
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manually) - converting a larger type to a smaller size type----explicit type casting
double -> float -> long -> int -> char -> short -> byte
*/
