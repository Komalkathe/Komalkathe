package com.inheritance;

public class Singleinheritancedog extends Singleinheritanceanimal {

public void bark () {
	System.out.println("dog is barking");
}
public static void main (String [] args) {
	//Syntax for creating an object
			// classname objectname= new classname();
	Singleinheritancedog obj= new Singleinheritancedog();
	eat();
	obj.bark();
}
}

/*single                             
  class A    animal
 
|
Class B     dog


class A     animal2
|
multilevel                  Class B        dog2 extentds animal2
|
class C        babydog extends dog2
*/