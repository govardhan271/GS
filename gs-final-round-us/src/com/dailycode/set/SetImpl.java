package com.dailycode.set;

import java.util.ArrayList;
import java.util.List;

public class SetImpl {

	public static void main(String[] args) {
		MyHashSet<String> mySet = new MyHashSet<>();
		mySet.add("Govardhan");	
		mySet.add("Govardhan");	
		mySet.remove("Govardhan");
		System.out.println(mySet.contains("Govardhan"));
	}

}
class MyHashSet<T>{
	private final int Max_Size= 100;
	private List<List<T>>list;
	public MyHashSet() {
		list = new ArrayList<>(Max_Size);
		for(int i =0;i<Max_Size;i++) {
			list.add(null);
		}	
	}
	public void add(T key) {
		int hash = key.hashCode();
		int bucketIndex = hash%Max_Size;
		List<T> subList = list.get(bucketIndex);
		if(subList == null) {
			subList = new ArrayList<>();
			subList.add(key);
			list.set(bucketIndex,subList);
		}else if(!subList.contains(key)) {
			subList.add(key);
		}
	}
	public void remove(T key) {
		int hash = key.hashCode();
		int bucketIndex = hash%Max_Size;
		List<T> subList = list.get(bucketIndex);
		if(subList!=null) {
			subList.remove(key);
		}else {
			System.out.println("No "+key+" element to remove");
		}
	}
	public boolean contains(T key) {
		int hash = key.hashCode();
		int bucketIndex = hash%Max_Size;
		List<T> subList = list.get(bucketIndex);
		return subList!=null&&subList.contains(key);
			 
	}
}
