package com.inheritance;

public class Hirarchicaldog extends Hirarchicalanimal {
	public void bark () {
		System.out.println("dog is barking");
		
	}

public static void main (String [] args) {
	Hirarchicaldog  obj= new Hirarchicaldog  ();
	obj.eat();
	obj.bark();
}
}