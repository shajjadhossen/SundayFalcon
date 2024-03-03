package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

public static void main(String[] arges) {
	
	//Array store multiple data using index
	int age = 30;
	int[] ageFalcon = new int[] {25, 30, 28, 35, 40};
	
	//Array index               [0] [1] [2] [3] [4]
	
	 System.out.println("Students age : " + ageFalcon[3]);
		System.out.println("total Student ; " + ageFalcon.length);	


// Array  Multiple Array

	 String[] nameFalcon = new String[] {"shajjad", "Fariyan", "Mahedi", "Islam"};
	 System.out.println("Students name : " + nameFalcon[2]);
	 System.out.println("total Name ; " + nameFalcon.length);
	 
	
	 //	boolean Array
	 boolean[] attendanceFalcon = new boolean[] {true, false, false, true , true};
	 System.out.println("Students attendance : " + attendanceFalcon[4]);
	 System.out.println("total Name ; " + attendanceFalcon.length);


	 //Multi-Dimension Array
     int[][] ageFalcon2D = {{25, 30, 28, 35, 40},
                           {24, 28, 32, 22}};
     
     System.out.println("Student Age 2D ; " + ageFalcon2D[0][3]);
     //  Hashmap store multiple data using key-value pair, Implementation of map interface
     
     HashMap<String, Integer> StudentAge = new HashMap <String, Integer>();
     
     

     StudentAge.put("Tahmid", 25);
     StudentAge.put("Lubna", 24);
     StudentAge.put("Salman", 27);
     StudentAge.put("Rumi", 35);
     StudentAge.put("Sumaiya", 25);
     
     System.out.print("Hashmap Student Age : " + StudentAge.get("Lubna"));
     
     
     
     HashMap<String, String> Capital = new HashMap <String, String>();
     Capital.put("BD" , "Dhaka");
     Capital.put("USA", "Washington DC");
     System.out.println("Hashmap Capital ; " + Capital.get("BD"));
     
     //HashTable store multiple data using key-value pair, no  duplicate,
     //also is synchronized (only one thread can be modified)
     
     Hashtable<String, String> Region = new Hashtable <String, String>();
     Region.put("BD" , "Asia");
     Region.put("USA", "America");
     System.out.println("Hashtable Region : " + Region.get("BD"));

     
     
     

//Hashset stored unordeored collection containing unique value , implementation of set interface 
HashSet<String> Car = new HashSet<>();
Car.add("BMW");
Car.add("TESLA");
Car.add("AUDI");
Car.add("FORD");
System.out.println(Car);
}
}


