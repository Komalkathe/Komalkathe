package com.conditionblock;

public class ifelsedemo {
	public static void main (String []args ) {
		int a=10;
		if (a<11) {
			System.out.println("hello");
		}else {
			System.out.println("hi");
	}
//if student mark is greater than 70 then print distinction
//if student marks are between 50-70 then print first class
// if it less than 50 then print fail	
		int studentsmark= 80;
		if (studentsmark>70){
		System.out.println("distinction");
	}else if (studentsmark>=50 && studentsmark<=70) {
			System.out.println("average");
	}else {
		System.out.println("fail");
		
		
		}
		
}
}

/*Use if to specify a block of code to be executed, if a specified condition is true
Use else to specify a block of code to be executed, if the same condition is false
Use else if to specify a new condition to test, if the first condition is false
Use switch to specify many alternative blocks of code to be executed

Syntax

if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
*/
/*///IF ---Else IF--Else Syntax
 * if (condition1) { 
 * // block of code to be executed if condition1 is true
 *  }
 *
 * else if (condition2) { // block of code to be executed if the condition1 is
 * false and condition2 is true
 *  } 
 * 
 * else { // block of code to be executed if the
 * condition1 is false and condition2 is false }
 */

