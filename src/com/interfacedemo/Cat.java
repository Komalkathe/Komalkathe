package com.interfacedemo;

public interface Cat {
	public void eat () ;    
	public void bark ();
	public void sleep ();


}



/*Notes on Interfaces:
Like abstract classes, interfaces cannot be used to create objects 
Interface methods do not have a body - the body is provided by the "implements" class
On implementation of an interface, you must override all of its methods
Interface methods are by default abstract and public
Interface attributes are by default public, static and final
An interface cannot contain a constructor (as it cannot be used to create objects)

Why And When To Use Interfaces?
1) To achieve security - hide certain details and only show the important details of an object (interface).

2) Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. Note: To implement multiple interfaces, separate them with a comma */