package com.upskill.java_5;

public class AbstractClassImplementation extends AbstractClass {

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

}
