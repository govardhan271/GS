package com.dailycode.designPatterns;

public class SingletonClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Abc a = Abc.getInstance();
//		Abc b = Abc.getInstance();
//		System.out.println(a==b);
		new Thread(()->Abc.getInstance()).start();
		new Thread(()->Abc.getInstance()).start();
	}

}
class Abc{
	private static Abc obj;
	private Abc() {
		System.out.println("Called");
	}
	public static Abc getInstance() {
		if(obj == null) {
			synchronized (Abc.class) {
				if(obj == null) {
					obj = new Abc();
				}
			}
			
		}
		return obj;
	}
}


