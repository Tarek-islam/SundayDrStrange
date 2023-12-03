package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {
		
		//Array store multiple data using index
		
		int age = 30;
		int[] ageDrStrange = new int[]{25, 21, 30, 35, 28};
		
		//Array index       [0] [1] [2] [3] [4]
		
		System.out.println(age);
		System.out.println(ageDrStrange[4]);

	
	String [] nameDrStrange = new String[] {"Tarek", "Adnan", "Jisan", "Mahdi"};
	
	System.out.println(nameDrStrange[3]);
	System.out.println(nameDrStrange.length);     // length for how many data u have
	
	//Multi-Dimentional Array
	int[][] ageDrStrange2D = {{25, 21, 30, 35, 28},     //[0][0] [0][1] [0][2] [0][3] [0][4]
			                  {31, 32, 25}};
	System.out.println(ageDrStrange2D[1][2]);
	
	                                   //Hashmap store multipul data using key-value pair, Implemention of map interface
	
	HashMap<String, Integer> Student = new HashMap <String, Integer>();
	Student.put("Jisan", 25);
	Student.put("Tarek", 26);
	Student.put("Adnan", 30);
	System.out.println(Student.get("Adnan"));
	
	
	HashMap<String, String> Capital = new HashMap<String, String>();
	Capital.put("BD", "Dhaka");
	System.out.println("City Name: " + Capital.get("BD"));
	
	
	
	//HaShset store unordered collection containing value, implemention of set interface
	 
	HashSet<String> car = new HashSet<String>();
	car.add("BMW");
	car.add("Tesla");
	car.add("Honda");
	car.add("Toyota");
	System.out.println(car);
	
	//Hashtable store multiple data using key-value pair, no duplicate, also is synchronized
	Hashtable<String, String> Region = new Hashtable<String, String>();
	Region.put("BD", "Asia");
	Region.put("USA", "AMERICA");
	System.out.println("Region: " + Region.get("BD"));
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	}
	


