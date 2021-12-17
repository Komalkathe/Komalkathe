package com.Collection;

import java.util.HashMap;

public class HashmapDemo {
	public static void main (String [] args) {
		HashMap <String,String>h=new HashMap <String,String>();
		h.put("maharashtra", "mumbai"); // here h is object
		h.put("karnataka", "banglore"); // (keyword, keyvalue)
		h.put("tamilnadu", "chennai");
		h.put("karnataka", "banglore");// dublicate value is not print in hashmap also and its not in sequential
		System.out.println(h);
		h.get("maharashtra");
		System.out.println(h.get("maharashtra"));// to get maharashtra key value which is mumbai 
		// print only keys
		for (String a:h.keySet()) { // for print keys
		System.out.println(a);
		}
		// print only values
		for (String b:h.values()) { // for each loop
	    System.out.println(b);     // not in sequence
		}
		// print both
		for (String c:h.keySet()) {
			System.out.println(c+"  "+h.get(c));
		}
		// for print one of it// for finding key's specific value
		for (String c:h.keySet()) {
			if(c.equalsIgnoreCase("maharashtra")) {
				System.out.println(c+"  "+h.get(c));
			}
			
		}
		h.remove("maharashtra");
		System.out.println(h);
		h.clear();
		System.out.println(h);
		System.out.println(h.size());


}
}

//homework- remove specific key (remove mharashtra keyword), try clear, size

/* A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, or the same type, like: String keys and String values:
*/