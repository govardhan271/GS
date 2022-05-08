package com.dailycode.designPatterns;

public class FactoryDesign {

	public static void main(String[] args) {
		Laptop laptop = LaptopFactory.getType(LaptopType.Dell);
		System.out.println(laptop.getFaeature());
	}

}
enum LaptopType{
	Dell,Mac;
}
class LaptopFactory{
	public static Laptop getType(LaptopType type) {
		switch(type) {
		case Dell:
			return new Dell("8GB", "intel 5"," 512GBSSD");
		case Mac:
			return new Mac("8GB", "Mac Processor"," 128GBSSD","GPU enabled");
		default:
			return null;
		}
			
	}
	
}
class Laptop{
	String ram;
	String processor;
	String storage;
	public Laptop(String ram, String processor, String storage) {
		this.ram = ram;
		this.processor = processor;
		this.storage = storage;
	}
	public String getFaeature() {	
		return this.getClass().getSimpleName()+" is of "+ram+", "+processor+" "+storage;
	}
}
class Mac extends Laptop{
	String gpu;
	public Mac(String ram, String processor, String storage, String gpu) {
		super(ram,processor,storage);
		this.gpu = gpu;
		
	}
	@Override
	public String getFaeature() {
		return this.getClass().getSimpleName()+" is of "+ram+", "+processor+" "+storage+" "+
	gpu;
	}
}
class Dell extends Laptop{
	public Dell(String ram, String processor, String storage) {
		super(ram,processor,storage);
	}

	
}