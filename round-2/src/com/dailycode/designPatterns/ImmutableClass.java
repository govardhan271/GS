package com.dailycode.designPatterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ImmutableClass {

	public static void main(String[] args) {
		ImmutableList il = new ImmutableList();
		il.getList().add(5);
		System.out.println(il.getList());
//		ImmutableArray ia = new ImmutableArray();
//		ia.getArray()[0]=3;
//		System.out.println(Arrays.toString(ia.getArray()));
	}

}
final class ImmutableList{
	private final List<Integer> list;
	public ImmutableList() {
		list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
	}
	public List<Integer> getList(){
	//return list; this should not be the case
		return new ArrayList<Integer>(list);
	}
}

final class ImmutableArray{
	private final int[] array;
	public ImmutableArray() {
		array = new int[] {0,1,2};
	}
	public int[] getArray() {
		//return array;
		return Arrays.copyOf(array,array.length );
	}
}
