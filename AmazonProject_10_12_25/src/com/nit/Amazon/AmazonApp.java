package com.nit.Amazon;

import java.util.*;
abstract class Ecommerce{
	public abstract void searchProduct();
	public abstract void addToCart();
	
}
class Login{
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void Login() {
		  String uName = "ig_tusharrr";
		  String pass = "Tushar@123";
			if(uName.equals(getUserName()) && pass.equals(getPassword())) {
				System.out.println("\nLogin Successfully !");
			}else {
				System.err.println("Invalid user plese try Again!.");
			}
	}
	
}
class Operation extends Ecommerce{
	
	@Override
	public void searchProduct() {
		
	}
	@Override
	public void addToCart() {
		 
	}
	
	
}
public class AmazonApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Login login = new Login();
		System.out.println("Enter Your User Name:");
		login.setUserName(sc.next()); 
		System.out.println("Enter Your Password:");
		login.setPassword(sc.next());
		login.Login();

	}

}
