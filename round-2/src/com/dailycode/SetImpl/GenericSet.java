package com.dailycode.SetImpl;

import java.util.ArrayList;
import java.util.List;

public class GenericSet {

	public static void main(String[] args) {
		MySet<String> set = new MySet<>();
		set.add("Govardhan");
		set.add("Govardhan");
		System.out.println(set.contains("Govardhan"));
		set.remove("Govardhan");
		System.out.println(set.contains("Govardhan"));
	}
}

class MySet<T>{
	private final int Max_Size = 100;
	List<List<T>> list;
	public MySet() {
		list = new ArrayList<>(Max_Size);
		for(int i=0;i<Max_Size;i++) {
			list.add(null);
		}
	}
	public void add(T key) {
		int hash=0;
		if(key instanceof Object) {
			hash= key.hashCode();
		}
		int index = hash%Max_Size;
		List<T>subList = list.get(index);
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
	public void remove(T key) {
		int hash=0;
		if(key instanceof Object) {
			hash= key.hashCode();
		}
		int index = hash%Max_Size;
		List<T>subList = list.get(index);
		if(subList!=null) {
			subList.remove(key);
		}
	}
	public boolean contains(T key) {
		int hash=0;
		if(key instanceof Object) {
			hash= key.hashCode();
		}
		int index = hash%Max_Size;
		List<T>subList = list.get(index);
		return subList!=null&&subList.contains(key);
	}
	
}
