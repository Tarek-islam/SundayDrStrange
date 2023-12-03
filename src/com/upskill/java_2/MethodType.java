package com.upskill.java_2;

public class MethodType {

	public static void main(String[] args) {
		MethodType obj = new MethodType();
		obj.annualIncomeVoid();
		
		weeklyIncomeStatic();
		System.out.println("My Monthly Income = " + obj.monthlyIncomeReturn());
		
	}
		
		static int hourlyIncome = 65;
		public void annualIncomeVoid(){
			int calculateAnnualIncome = hourlyIncome * 2000;
			System.out.println("My Annual Income = " + calculateAnnualIncome);
		}
		
		public static void weeklyIncomeStatic(){
			int calculateWeeklyIncome = hourlyIncome * 40;
			System.out.println("My Weekly Income = " + calculateWeeklyIncome);
		}
		
		
		public int monthlyIncomeReturn(){
			int calculateMonthlyIncome = hourlyIncome * 180;
			return calculateMonthlyIncome; 
		}
	}


