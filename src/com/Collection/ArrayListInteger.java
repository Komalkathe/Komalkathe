package com.Collection;

import java.util.ArrayList;

public class ArrayListInteger {
	public static void main (String [] args) {
		 ArrayList <Integer> k=new ArrayList <Integer>(); // if i put k here its neccessary to keep same below 
		    k.add(3);
			k.add(6);
			k.add(9);    
			k.add(12);
			k.add(15);
			k.add(15); // dublicate value is print in ArrayList which is not print in Hashset
			System.out.println(k);
			k.remove(1);// for removing value 6 
			System.out.println(k);
			System.out.println(k.size()); // output is 6 because total are 6 values.
			System.out.println(k.get(0)); // finding specific index  value use get method
			
			for (int i=0; i<k.size();i++) { // for loop 
				System.out.println(k.get(i));
			}
			for (int b:k) { // for each loop
				System.out.println(b);
			}
			
			
	}

}
