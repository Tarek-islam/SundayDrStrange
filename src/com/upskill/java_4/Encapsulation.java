package com.upskill.java_4;

public class Encapsulation {
	
	private String name = "Upskill";    //write & Read
	private int ssn = 12234567;         //write only
	private String username = "tarekislam";   //read only
	
	//Setter method - ssn  //set the data,write
	public void tarek(int adnanValue){
		ssn = adnanValue; 
	}
	//Getter method - username   //set the data ,read
	public String getUserName(){
		return username;
		
	}
	//Getter method - name
	public String getName(){
		return name;
	}
		//Setter method - name
		public void setName(String value){
			name = value;
		
	}
	public static void main(String[] args) {
		// Encapsulation used to hide the data using setter and getter method
		
	Encapsulation obj = new Encapsulation();
	System.out.println(obj.getName());
	System.out.println(obj.getUserName());
	obj.setName("Tarek");
	obj.tarek(1234567);

	}

}
