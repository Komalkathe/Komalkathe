package com.arrays;

public class TwodimensionalArrays {
	public static void main (String[] args) {
		//zeroth array and first array
		/*int[][] a= {{1,2,3},{4,5,6}};//two dimensional arrays
		
		System.out.println(a[1][2]);//1st bracket declare which arrays and 2nd bracket declare index
        System.out.println (a[0][1]);//print value 2
        System.out.println(a[1][2]);// print value 3
        System.out.println(a[1][0]);//print value 4
        System.out.println(a.length);//out put will be how many arryas are present in 
        
        System.out.println(a[1].length);
        System.out.println(a[0].length);
        */
		int [] [] myNumbers = {{1,2,3},{4,5,6}};
		//System.out.println(myNumbers.length);    //output 2
		//System.out.println(myNumbers[0].length); //output 3
		//System.out.println(myNumbers[1].length); // output 3
		for (int i = 0; i < myNumbers.length; i++) {
	    	
	      for(int j = 0; j < myNumbers[i].length; j++) {
	        System.out.println(myNumbers[i][j]);
	      }
        
}
}
}

//home work for loop in 2 dimensioanl array 1 nov 21
//read java oops project 
//next monday class 8.30 am 