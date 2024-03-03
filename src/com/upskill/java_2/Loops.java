package com.upskill.java_2;

public class Loops {
	
	/*
	 types of Loops
	        1. For Loop
	        2. While Loop 
	        3. Do While Loop
	        4. Infinite Loop
	        
	        
	 */
   public static void main(String[] args) {
//       practiceForLoop();
//       practiceWhileLoop();
//       practiceInfiniteLoop();
	   practiceNestedLoop();
   }
	 
   //For Loop
 
	   public static void practiceForLoop(){
		   int i ;
		   for (i=1; i <10; i++){
			   System.out.println(i);
		   }
 
	   }

	   
	   
	   //While Loop
	   public static void practiceWhileLoop(){
      int i = 1;
	   while(i<=10){
		     System.out.println("While Loops number = " + i);
		     		 i++;
	   }
    }
 

   //Do While Loop
   public static void practiceDoWhileLoop(){
	   int i = 1;
	   do {
		    System.out.println("Do While Loops number = " + i);
	 } while(i<0);
	   
   }


  //Infinite Loop
public static void practiceInfiniteLoop(){
	int i;
	for (i = 1; ; i++){
		System.out.println("For Loops number = " + i);
   
 
}
}

  //Nested Loop
 public static void practiceNestedLoop(){
	int i;
	int j;
	for (i = 1; i <= 10; i++){
		for (j = 1; j <=10 ; j++){
			int multipicationTable = i * j;
		System.out.print(multipicationTable + " ");
	}
	System.out.println(" ");
		}
       }
	}

 