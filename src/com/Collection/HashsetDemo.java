package com.Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {
	public static void main (String [] args) {
	HashSet	<String>a=new HashSet <String>();
	 a.add("abc");
	 a.add("xyz");
	 a.add("kln");   
	 a.add("xyz");
	 a.add("ghf");
	 a.add("asd");
	 System.out.println(a);                   // for printing all values
	
	 a.remove("abc");                         // for removing "abc from set
	 System.out.println(a); 
	
	 System.out.println(a.size());           // its use to find total size/length
	
	 a.clear();
	 System.out.println(a);
	
	 System.out.println(a.contains("kom"));  // output is false because  "kom" word is not declare in object

	 for (String b:a) {                     //  declare for each loop 
	 System.out.println(b);
	 }
	                                       // dublicate not allowed in hashset and it not in sequential
	
	
	 Iterator <String> m=a.iterator();
	 while (m.hasNext()) {
	 System.out.println(m.next());         // for printing continuous values
	    }
	 
	
	
}
}

//sequence of the value is not fixed
	//duplicates are not allowed

// homework- remove,size,clear,contains- 17/11/2021
//homework- hashset Int type 