package com.Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetInteger {
	public static void main (String [] args) {
		HashSet <Integer>a=new HashSet <Integer>();
		a.add(3);
		a.add(6);
		a.add(9);
		a.add(12);
		a.add(15);
		a.add(9);                        // its duplicate which not allowed in Hashset
		System.out.println(a);           // for printing all values
		a.remove(15);                      // for removing value 15
		System.out.println(a);
		
		System.out.println(a.size());             // for finding size/length of of obj
		
		System.out.println(a.contains(6));        // true because value 6 is present in it
		
		for (int b:a) { 
			System.out.println(b);
		}
		 Iterator <Integer> m=a.iterator();
		  
		    while (m.hasNext()) {
		    	System.out.println(m.next());// for printing continuous value 
		    }
	}

}

//sequence of the value is not fixed
	//duplicates are not allowed