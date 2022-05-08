package com.dailycode.designPatterns.solid;

public class SingleResponsibility {

	public static void main(String[] args) {
		AccountService.openAccount();
	}

}
//A class should have one and only one reason to change
class AccountService{
	public static void openAccount() {
		//1
		System.out.println("set account details");
		//2
		System.out.println("persist account details");
		//3
		System.out.println("Send notification");
		//if the database changes or way of sending notification changes then the class has
		//to be changed
	}
}
class AccountRepository{
	public static void createAccount() {
		System.out.println("save the account in database");
	}
}
class NotificatonService{
	public static void sendNotification() {
		System.out.println("send a welcome message");
	}
}
