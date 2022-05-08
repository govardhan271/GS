package com.dailycode.generics;

public class GenericClass {

	public static void main(String[] args) {

		System.out.println(new AGI<Integer>().addOrConcat(5, 9));
		System.out.println(new AGI<String>().addOrConcat("Java", "Programming"));
		System.out.println(AGF.addFloat(8.0,9.0));
		GenericInterface<Integer> giSum = (input1,input2)->input1+input2;
		System.out.println(giSum.add(6,8));
		GenericInterface<String> giConcat = (input1,input2)->input1+input2;
		System.out.println(giConcat.add("Spring","Boot"));
	}

}
interface GenericInterface<T>{//Generic Interface
	Object add(T input1, T input2);
}
class AGI<T>{//Generic Class
	
	public Object addOrConcat(T input1, T input2) {
		if(input1 instanceof Integer) {
			return (Integer)input1+(Integer)input2;
		}
		if(input1 instanceof String) {
			return (String)input1+(String)input2;
		}
		
		return null;
	}
}
class AGF{
	public static <T>Object  addFloat(T input1, T input2) {//Generic Method
		if(input1 instanceof Double && input2 instanceof Double) {
			return (Double)input1+(Double)input2;
		}
		
		return null;
	}
}

