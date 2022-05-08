package com.dailycode.designPatterns.solid;

public class LiskovSubstitution {
//Objects of super class shall be replaced with objects of subclasses
	public static void main(String[] args) {
		new Vehicle().start();
		new Vehicle().stop();

	}

}
class Vehicle{
	public void start() {
		System.out.println(this.getClass().getSimpleName()+" has started");
	}
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+" has stopped");
	}
}
class Car extends Vehicle{
	public void start() {
		System.out.println(this.getClass().getSimpleName()+" has started");
	}
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+" has stopped");
		
	}
}
class Bike extends Vehicle{
	public void start() {
		System.out.println(this.getClass().getSimpleName()+" has started");
	}
	public void stop() {
		System.out.println(this.getClass().getSimpleName()+" has stopped");
	}
}
