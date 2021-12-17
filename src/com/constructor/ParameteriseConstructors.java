package com.constructor;

public class ParameteriseConstructors {
	public ParameteriseConstructors (String name, int age) {
		System.out.println(name+" "+age);

}
	public static void  main (String []args) {
		 ParameteriseConstructors	 obj = new  ParameteriseConstructors ("komal",22);
}
}