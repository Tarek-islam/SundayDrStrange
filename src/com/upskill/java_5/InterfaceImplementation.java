package com.upskill.java_5;

public class InterfaceImplementation implements Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void iDoor() {
		System.out.println("My car has 4 door");

		
	}

	@Override
	public void iWheel() {
		System.out.println("My car has 4 Wheel");

		
	}

	@Override
	public void iEngine() {
		System.out.println("My car has 2 engine");

		
	}

	@Override
	public int iSail() {
		System.out.println("My car has 1 sail");

		return 1;
	}

	@Override
	public String iCabin() {
		System.out.println("My car has AC cabin");

		return "AC";
	}
	/*
	(Parent)				   (Keyword) 				(Child)				 (Keyword) 				(GrandChild)						
	Class[R]					extends					  Class [R]								 
	Abstract Class [R][i]   	extends					  Class [R][R]	
	Interface [i]   			implements				  Class	[R]			
	Interface [i] 				extends				  	 Interface [i][i]		 implements		    Class [R][R]	
	execute
	*/
}
