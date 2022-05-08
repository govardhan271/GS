package com.dailycode.designPattern;

public class FactoryMain {

	public static void main(String[] args) {
		Laptop laptop = LaptopFactory.getType(LaptopTye.Dell);
		System.out.println(laptop.getFeatures());
	}
}
enum LaptopTye{
	Dell,Mac;
}
class LaptopFactory{
	public static Laptop getType(LaptopTye type) {
		switch(type) {
		case Mac:
			return new Mac("8GB", "i5", "128GB SSD","gpu enabled");
		case Dell:
			return new Dell("8GB", "i5", "512GB SSD");
		default:
			return null;
		}
	}
}
class Laptop{
	public String ram;
	public String processor;
	public String storage;
	public Laptop(String ram,String processor,String storage) {
		this.ram = ram;
		this.processor = processor;
		this.storage = storage;
	}
	public String getFeatures() {
		return this.getClass().getSimpleName()+" is of "+ram+" RAM "+processor+" processor "+
				storage+" storage";
	}
}
class Dell extends Laptop{
	public Dell(String ram,String processor, String storage){
		super(ram,processor,storage);
	}
}
class Mac extends Laptop{
	private String gpu;
	public Mac(String ram,String processor, String storage,String gpu){
		super(ram,processor,storage);
		this.gpu = gpu;	
		
	}
	public String getFeatures() {
		return this.getClass().getSimpleName()+" is of "+ram+" RAM "+processor+" processor "+
				storage+" storage and "+gpu;
	}
}

