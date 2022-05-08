package com.dailycode.set;

import java.util.ArrayList;
import java.util.List;

public class CommonArrayElemnts {

	public static void main(String[] args) {
		   int array1[] = {2, 4, 8,4};
		   int array2[] = {2, 3, 4, 8, 10, 16,4};
		   int array3[] = {4, 8, 14, 40,4};
		   List<Integer>list1 = new ArrayList<>();
		   List<Integer>list2 = new ArrayList<>();
		   List<Integer>list3 = new ArrayList<>();
		   for(int i: array1) {
			   list1.add(i);
		   }
		   for(int i: array2) {
			   list2.add(i);
		   }
		   for(int i: array3) {
			   list3.add(i);
		   }
		   List<Integer>intersection = new ArrayList<>(list1);
		   intersection.retainAll(list2);
		   intersection.retainAll(list3);
		   System.out.println(intersection);

	}

}
