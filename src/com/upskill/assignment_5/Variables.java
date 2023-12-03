package com.upskill.assignment_5;

public class Variables {
	// Instance OR global variable - Variable declared in class level, outside method
	//Static variable - variables belong to class and don't required creating object
	//Local variables - variables declared in methods
	//Method parameter - variables used as method parameter

	public static void main(String[] args) {
		Variables obj = new Variables();
		obj.newyork();
		obj.texas("Steak");
		System.out.println(obj.country);
 System.out.println(president);
	}
	String country = "USA";
	static String president = "Biden";
	
public static void newyork(){
String city = "Queens";
String police = "NYPD";
System.out.println(police);
}
public static void texas(String food){
	String city = "Austin";
	String police = "APD";
	System.out.println(police);
	System.out.println(food);
}

}
