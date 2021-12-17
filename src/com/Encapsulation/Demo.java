package com.Encapsulation;

public class Demo {
	private String name;

	public String getName() { 
		return name;
	}

	public void setName(String newname) {
		this.name = newname; //newname=Rahul
	}
}
	







/*
 * Encapsulation
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must:

declare class variables/attributes as private


/*
	 * The get method returns the value of the variable name.
	 * 
	 * The set method takes a parameter (newName) and assigns it to the name
	 * variable. The this keyword is used to refer to the current object.
	 */
/*
 * Better control of class attributes and methods Class attributes can be made
 * read-only (if you only use the get method), or write-only (if you only use
 * the set method) Flexible: the programmer can change one part of the code
 * without affecting other parts Increased security of data
 */


 