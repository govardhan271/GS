package com.dailycode.SetImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		MyHashSet set = new MyHashSet();
	}

}
class MyHashSet{
	private final int Max_Size = 100;
	private List<List<Integer>> list;
	public MyHashSet() {
		list = new ArrayList<>(Max_Size);
		for(int i=0;i<Max_Size;i++) {
			list.add(null);
		}
	}
	public void add(int key) {
		int index = key%Max_Size;
		List<Integer>subList = list.get(index);
		if(subList==null) {
			subList = new ArrayList<>();
			subList.add(key);
			list.set(index, subList);
		}else {
			if(!subList.contains(key)) {
				subList.add(key);
			}
		}
	}
	public void remove(int key) {
		int index = key%Max_Size;
		List<Integer>subList = list.get(index);
		if(subList!=null) {
			subList.remove(Integer.valueOf(key));
		}
	}
	public boolean contains(int key) {
		int index = key%Max_Size;
		List<Integer>subList = list.get(index);
		return subList!=null&&subList.contains(key);
	}
}

