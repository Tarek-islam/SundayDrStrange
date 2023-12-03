package com.upskill.java_2;

public class Loops {
	  /* 1.For loop
	   * 2.While loop
	   * 3.Do while loop
	   * Infinite loop
	   */

	public static void main(String[] args) {
	//	practiceForLoop(); 
	//	practiceWhileLoop();
	//	practiceDoWhileLoop();
	//	practiceInfiniteLoop();
		practiceNestedForLoop();
	}
		
		public static void practiceForLoop(){               // for decrement just put i=10,i<1,i--
			int i;
			for(i=1; i<=10; i++){            					   // i=lower limit, i=upper limit,i=increment or decrement
				System.out.println("For Loops number = " + i);
				
				
			}
	}

		public static void practiceWhileLoop(){      //while loop - do again and again upto condition match
			int i = 1;                                           //innitializing condition
			while(i<10){                                         //Setting condition
				System.out.println("While Loops number = " + i); //statement
				i++;                                             //increment or decrement
			
		}
		}
		public static void practiceDoWhileLoop(){  //do action then match condition
		int i = 0;
		do{
			System.out.println("Do While Loops number = " + i);
			i++;
		}while (i<=10);
		}
		
		public static void practiceInfiniteLoop(){   // Never ending loop
			int i;                                     // no upper limit
			for (i=1; ; i++){
				System.out.println("Infinite Loops number = " + i);
				
			}
		}
		
		public static void practiceNestedForLoop(){
		
			int i;
			int j;
			for (i=1; i<=10; i++){
				for(j=1; j<=10; j++){
					int multipicationTable = i * j;
					System.out.print(multipicationTable + " ");
				}
				System.out.println(" ");
			}
		}
		
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
