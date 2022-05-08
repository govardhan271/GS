package com.dailycode.rough;

import java.util.Optional;

public class OptionalClass {

	public static void main(String[] args) {
		Employee gov = new Employee("Gova", 26, null, "India");
	//System.out.println(Optional.of(gov.getEmail()));
		Optional<String>empMail= Optional.ofNullable(gov.getEmail());
		System.out.println(empMail.isPresent());
		System.out.println(empMail.orElse("orElse@gmail"));
		System.out.println(empMail.orElseGet(()->"orElseGet@gmail"));
//		System.out.println(empMail.orElseThrow(()->new IllegalArgumentException("No Email")));
		
		System.out.println(empMail.map(String::toUpperCase).orElseGet(()->"default"));
	}

}
class Employee{
	private String name;
	private int age;
	private String email;
	private String country;
	public Employee(String name,int age,String email,String country) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.country = country;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getEmail() {
		return email;
	}
	public String getCountry() {
		return country;
	}

}
