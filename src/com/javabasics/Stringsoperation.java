package com.javabasics;

public class Stringsoperation {
	public static void main(String[] args ) {
		String S="my name is komal";
		
System.out.println(S.length());// length should be start form one and index should start from zero

System.out.println(S.toUpperCase());//for converting to uppercase
System.out.println(S.toLowerCase());//for converting to lowercase
System.out.println(S.charAt(4)); // for finding the character at index number 4
System.out.println(S.indexOf("name"));// for finding index of the character or string 
String d="surname";
String a="surname";
System.out.println(d.concat(a));//for joining two strings
d.substring(1);
System.out.println(d.substring(1 ));//for finding first index

System.out.println(d.substring(1, 4));//for finding first and 4 index
System.out.println(d.contains("name"));//for finding 'name' is present in surname word or not
System.out.println(d.equals(a));//for finding 
System.out.println(d.replace('u', 'i'));

String k=new String("    What is your name??   ");
System.out.println("String berfore trim:"+k);
System.out.println("String after trim:"+k.trim());
String p="my name is \"komal\" kathe";
System.out.println(p);
String q="This is \\ character";
System.out.println(q);



}
}

//Homework- contains , equal, replace ,trim