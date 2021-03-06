package com.dailycode.designPatterns.solid;

public class OpenClosed {

	public static void main(String[] args) {
		Shape rect = new Rectangle(3,4);
		System.out.println(rect.calculateArea());
		Shape circle = new Circle(4);
		System.out.println(circle.calculateArea());

	}

}
abstract class Shape{
	public abstract double calculateArea();
}
class Rectangle extends Shape{
	private double length;
	private double width;
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	@Override
	public double calculateArea() {
		return length*width;
	}	
}
class Circle extends Shape{
	private double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	@Override
	public double calculateArea() {
		
		return Math.PI*radius*radius;
	}
}
