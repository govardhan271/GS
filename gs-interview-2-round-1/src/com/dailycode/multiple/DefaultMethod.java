package com.dailycode.multiple;

public class DefaultMethod {

	public static void main(String[] args) {
		B obj = new C();
		obj.defaultMethod();
	}
}
interface A{
	default void defaultMethod() {
		System.out.println("Default Method in A");
	}

}
interface B{
	default void defaultMethod() {
		System.out.println("Default Method in B");
	}
}
class C implements A,B{

	@Override
	public void defaultMethod() {
		A.super.defaultMethod();
		B.super.defaultMethod();
	}



}
