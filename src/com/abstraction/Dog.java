package com.abstraction;

public class Dog extends Animal{
	
 public static void main (String [] args) {
	 Dog obj= new Dog ();
	 obj.eat();
	 obj.bark();
}

@Override
public void bark() {
	System.out.println("Dog is barking");
	// TODO Auto-generated method stub
	
}
}