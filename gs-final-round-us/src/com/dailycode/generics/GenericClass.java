package com.dailycode.generics;

public class GenericClass {

	public static void main(String[] args) {
		GenericInterface<Integer> gi = (input1,input2)-> input1+input2;
		GenericInterface<String> gis = (input1,input2)-> input1+input2;
		System.out.println(gi.addOrConcat(5, 3));
		System.out.println(gis.addOrConcat("Java", "Programming"));
		
		System.out.println(new SimpleAddorConcat<Double>().addOrConcat(5.0, 9.0));

	}

}
interface GenericInterface<T>{
	public Object addOrConcat(T input1, T input2);
}
class SimpleAddorConcat<T>{
	public Object addOrConcat(T input1,T input2) {
		if(input1 instanceof Double) {
			return (Double)input1+(Double)input2;
		}
		if(input2 instanceof String) {
			return (String) input1+(String)input2;
		}
		return null;
	}
}
