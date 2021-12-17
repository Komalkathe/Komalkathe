package com.Collection;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main (String []args) {
		ArrayList<String>a=new ArrayList <String>();
		a.add("komal");
		a.add("prajakta");
		a.add("surani");
		a.add("Ram");
		System.out.println(a);
		a.add(1, "shital");
		System.out.println(a);
		a.remove(3);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.get(2)); // finding specific index use get method
		
		for (int i=0; i<a.size();i++) {
			System.out.println(a.get(i));
		}
			for(String b:a) { //b is new variable
				System.out.println(b); 

}
}
}
// do this same for int - homework

// in array list we can add, remove, add dublicate , its size is not fixed 
// in array  can not add , remove, its size is fixed 

//sequence of the value is not fixed
	//duplicates are not allowed



/*The ArrayList class is a resizable array, which can be found in the java.util package.

The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want.
*/