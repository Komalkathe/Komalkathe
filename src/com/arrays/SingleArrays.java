package com.arrays;

public class SingleArrays {
	public static void main (String[]args) {
		int a=10;
		System.out.println(a);
		int[]b= {10,20,30,40};
		System.out.println(b.length);
		System.out.println(b[2]);//print index 2
		System.out.println(b[3]=50);//index 3 replaced by 50
		//note: we cant add or remove value in arrays
		//we will see arrays list concept later
	for(int i=0;i<4;i++) {
		System.out.println(b[i]);

}
	//for each loop
	for (int v:b) {
		System.out.println(v);
	}
	String [] c= {"komal,kanchan,vilas,vishal"};
	for (String d:c) {
	System.out.println(d);
	}
	char []h={'k','o','m','a','l'} ;
	for (char l:h) {
		System.out.println(l);
	}
	
}
}