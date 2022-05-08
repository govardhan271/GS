package com.dailycode.designPatterns.solid;

//should never be forced to implement the interface methods a class doesn't use
//we segregate the interfaces
public class InterfaceSegregation {

	public static void main(String[] args) {

	}

}
interface Restaurant{
	void vegMeals();
	void nonVegMeals();
}
//interface NonVegRestaurant{
//	void nonVegMeals();
//}
class AbcVegRestaurant implements Restaurant{

	@Override
	public void vegMeals() {
		System.out.println("Serving veg meals");
	}
	@Override
	public void nonVegMeals() {
		System.out.println("Sorry! we don't serve nonveg");
	}

}
class XyzNonVegRestaurant implements Restaurant{

	@Override
	public void vegMeals() {
		System.out.println("Serving veg meals");
	}

	@Override
	public void nonVegMeals() {
		System.out.println("Serving non veg meals");
		
	}

}