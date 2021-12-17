package com.interfacedemo;

public class BabyCat implements Cat {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Cat is eating");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Cat is barking");           // in interface only abstact method is used 
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Cat is sleeping");
	}
	
	public static void main (String []args) {
		BabyCat obj = new BabyCat ();
		obj.eat();
		obj.bark();
		obj.sleep();

}
}
