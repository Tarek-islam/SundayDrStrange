package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType {

	/* polymorphism is the ability of an object to take on many forms.
	 * overriding
	 * /* Polymorphism is the ability of an object to take on many forms.
		- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
		- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
	 */
	public static void main(String[] args) {
		car("Red", 4);
		Polymorphism obj = new Polymorphism();
		obj.annualIncomeVoid();
		
	}
	public void annualIncomeVoid(){
		int pastAnnualIncome = 130000;
		int rentalAnnualIncome = 18000;
		int sideIncome = 15000;
		int bonus = 25000;
		int newIncome = pastAnnualIncome + rentalAnnualIncome + sideIncome + bonus;
		System.out.println("My Annual Income = " + newIncome);
	}
		 
		
		public static void car(){
			System.out.println("My car is Honda");
		
		}
		public static void car(String Color){
			System.out.println("My car is Honda, Its Color is " + Color);
			
		}
		public static void car(String Color, int Seat){
			System.out.println("My car is Honda, Its Color is " + Color + "It has seat" + Seat);
			}
		
		public static void car(int door){
			System.out.println("My car is Honda, Its has door " + door);
		}
		
	}


// Method Overriding - 