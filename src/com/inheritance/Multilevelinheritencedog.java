package com.inheritance;

public class Multilevelinheritencedog extends Multilevelinheritanceanimal {
	public void bark () {
		System.out.println("dog is barking");
		
	}

public static void main (String [] args) {
	 Multilevelinheritencedog  obj= new Multilevelinheritencedog  ();
	obj.eat();
	obj.bark();
}
}
//homework 
/*class A         hirarchical
/       \
class B  class c

 class A class B  Multiple
    /   \
   class c
*/