package com.inheritance;

public class Hirarchicalbabydog  extends Hirarchicalanimal {
	public void bark () {
		System.out.println("dog is barking");

}
	public static void main (String [] args) {
		Hirarchicalbabydog obj= new Hirarchicalbabydog  ();
		obj.eat();
		obj.bark();
}
}