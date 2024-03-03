package com.upskill.java_6;

public class Singleton {


private static final Singleton SingletonObj = null;

//Singleton is class that can have only one object
//Private constructor, it prevent any other class from instancing
	
public Singleton(){

}
//Private static objects of the class
public Singleton Singletonobj = new Singleton();

public static Singleton getInstance(){
	return SingletonObj;
}

protected static void demo(){
	System.out.println("Demo method for singleton class");
	
	
	
	
}



}
