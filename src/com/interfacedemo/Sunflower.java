package com.interfacedemo;

public class Sunflower implements Rose, Lotus {
	public static void main (String [] args) {
		Sunflower obj = new Sunflower ();
		obj.smell();
		obj.look();

}

	@Override
	public void look() {
		// TODO Auto-generated method stub
		System.out.println(" Lotus Looks");
	}

	@Override
	public void smell() {
		// TODO Auto-generated method stub
		System.out.println(" Rose Smells");
	}
}
