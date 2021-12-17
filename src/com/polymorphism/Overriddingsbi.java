package com.polymorphism;

public class Overriddingsbi extends Overriddingaxis {
	public  void getrateofinterest  () {
		System.out.println("rate of interest is 7%");
		
}
	public static void main (String [] args) {
	//getrateofinterest(); // No, a static method cannot be overridden
		Overriddingsbi	 obj=new Overriddingsbi ();
		obj.getrateofinterest();
		
		Overriddingaxis	 obj1=new Overriddingaxis ();
		obj1.getrateofinterest();
	
}
}