package com.nit.abstraction;
//2. WAP for the below requirement
//Create a super class and three sub classes
//Create a method in super class
//Perform method overriding in 1st sub class and 3rd sub class
//Create all three subclass objects and call the methods from main method

class Mobile{
	public void mibileCharge() {
	     System.out.println("mobile is charging.");
	}
}
class OnePlus extends Mobile{
	public void mibileCharge() {
		System.out.println("Mobile is charging with 100W charger.");
	}
    }
class Realme extends Mobile{
//	public void mibileCharge() {
//		System.out.println("Mobile is charging with 60W charger.");
//	}
}
class Poco extends Mobile{
	
	public void mibileCharge() {
		System.out.println("Mobile is charging with 36W charger.");
	}
}

public class test2 {
     public static void main(String[] args) {
		OnePlus m1 = new OnePlus();
		Realme m2 = new Realme();
		Poco m3 = new Poco();
		m1.mibileCharge();
		m2.mibileCharge();
		m3.mibileCharge();
	}
}
