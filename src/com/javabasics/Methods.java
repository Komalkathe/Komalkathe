package com.javabasics;

public class Methods {
	public void method1() {   // This is non static method
	System.out.println("hello i am komal");//out put will no cuase its out from main method 
	}
	public static void method2() { //This is static method
		System.out.println("its me komal");
	}
	public void method3() { // This is non static method
		System.out.println("i am a student");
	}
	public static void method4() {  // This is static method 
		System.out.println("i am studing java");
	}
	public static int method5() { // Method with return type
		int a=5;
		return a;
	}
	public void method6(String name,int age) {  // String name , int age this are parameter
	System.out.println(name+"        "+age); //space is added for printing space in output
}
	public void method7(int rollnumber,int marks,String name) {
		System.out.println("my roll number is "  +  ""+rollnumber+"my marks are" + ""+marks+""+ "my name is komal");
	}
	public static void main (String []args) {
		//Syntax for creating an object
		// classname objectname= new classname();
		Methods obj=new Methods();
		obj.method1();            // for non static method object have to create ......... NON STATIC
		method2();               //for  static method no need to create object.............. STATIC
		obj.method3();
		method4();
		System.out.println (method5()); //method with return type 
		// void means does not return anything 
		obj.method6("komal",22);                                        // ( OBJECT IS CREATED INSIDE THE MAIN METHOD )//
		obj.method6("kanchan",23);
		obj.method7(20,78,"komal");
		// my rollnumber is 20 and marks are 78 komal is my name
		
  
}
}
