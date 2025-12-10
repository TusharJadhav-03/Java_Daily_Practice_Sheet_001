package com.nit.abstraction;

/* 
1. WAP for the below requirement
   Create  a method in supermost class
   Perform method overriding in last sub class
   Create object and call the method
 */
class Vehicle{
	public void startEngine() {
		System.out.println("Vehicle Engine started.");
	}
}
class Car extends Vehicle{
        @Override
        public void startEngine() {
        	System.out.println("Car Engine Started.");
        }
}
public class test1 {
   public static void main(String []args) {
	   Car c = new Car();
	   c.startEngine();
   }
}
