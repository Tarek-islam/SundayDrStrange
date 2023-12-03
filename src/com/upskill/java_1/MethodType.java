package com.upskill.java_1;

public class MethodType {
	/* Types of Methods
	 * Void Method
	 * Static Method
	 * Return Type method
	 */
	

	public static void main(String[] args) {
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		
		weeklyIncomeStatic();
		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());
		System.out.println(name());
		
		
	}
	
	static int hourlyIncome = 65;
	//void method
	public void annualIncomeVoid(){
		int calculateAnnualIncome = hourlyIncome * 2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
		
	}
//static method
	public static void weeklyIncomeStatic(){
		int calculateWeeklyIncome = hourlyIncome * 40;
		System.out.println("my Weekly Income = " + calculateWeeklyIncome);
	}
	//return type method
	public int monthlyIncomeReturn(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}
	public static String name(){
		return "Tarek";
		
	}
	
}
