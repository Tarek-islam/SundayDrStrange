package com.upskill.java_4;

public class Constructor {

	
	String studentName;
	int studentAge;
	public Constructor(String name){
		studentName = name;
	}
	public Constructor(String name, int age){
		studentName = name;
		studentAge = 29;
	}
	public static void main(String[] args) {
		Constructor obj = new Constructor("Tarek");
		System.out.println(obj.studentName);
		
		Constructor obj2 = new Constructor("Tarek", 25);
		System.out.println(obj2.studentName +" "+obj2.studentAge);
		
	}

}
