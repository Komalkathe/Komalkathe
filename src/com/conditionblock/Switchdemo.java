package com.conditionblock;

public class Switchdemo {
	public static void main(String [] args) {
int day;
switch(day=5)
{
case 1:
	System.out.println("monday");
case 2:
	System.out.println("tuesday");
	break;
case 3:
	System.out.println("wednesday");
	break;
case 4:
	System.out.println("thursday");
	default:
		System.out.println("saturday");
}
}
}


/*
 * switch(expression){    
case value1:    
 //code to be executed;    
 break;  //optional  
case value2:    
 //code to be executed;    
 break;  //optional  
......    
    
default:     
  code to be executed if all cases are not matched;  
}    
 */