package com.dailycode.designPattern;

import java.util.HashMap;
import java.util.Map;

public class ImmutableClass {

	public static void main(String[] args) {
		ImmutbaleMap im = new ImmutbaleMap();
		im.getPhoneBook().put("Hasi", "9876");
		System.out.println(im.getPhoneBook());
	}

}
final class ImmutbaleMap{
	private final Map<String,String> phoneBook;
	public ImmutbaleMap() {
		phoneBook = new HashMap<>();
		phoneBook.put("Govardhan", "*****");
		phoneBook.put("Hasitha", "*******");	
	}
	public Map<String, String> getPhoneBook(){
		return new HashMap<String, String>(phoneBook);
	}
}