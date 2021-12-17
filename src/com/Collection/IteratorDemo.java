package com.Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main (String []args) {
		 ArrayList <Integer> k=new ArrayList <Integer>(); // if i put k is obj here its neccessary to keep same below 
		    k.add(3);
			k.add(6);
			k.add(9);    
		    k.add(12);
		    Iterator <Integer> m=k.iterator();
		    System.out.println(m.next());// to print 1st element
		    System.out.println(m.next()); // second element
		    while (m.hasNext()) {
		    	System.out.println(m.next());// for printing continuous value 
		    }

}
}
// HW-hashset integer string 


/*
 * An Iterator is an object that can be used to loop through collections, like
 * ArrayList and HashSet. It is called an "iterator" because "iterating" is the
 * technical term for looping.
 * 
 * To use an Iterator, you must import it from the java.util package.
 */