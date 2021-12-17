package com.abstraction;

public abstract class Animal {
	public void eat ( ) {                            //regular method
		System.out.println("animal is eating");
		
	}
	public abstract void  bark () ;               // abstract method
	
	
	

}
 //in abstract class can not create object





/*
 *Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces

The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).
Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods:*/