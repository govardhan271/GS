package com.dailycode.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Employee gov = new Employee("Govardhan", 26, "Java");
		Employee vis = new Employee("Vishnu", 24, "Python");
		Employee hasi = new Employee("Hasith", 27, "pharmacy");
		Employee pranay = new Employee("Pranay", 27, "Java");
		Employee gova = new Employee("Govardhan", 27, "Java");
		List<Employee> employees = new ArrayList<>();
		employees.add(hasi);
		employees.add(gov);
		employees.add(vis);
		employees.add(pranay);
		Collections.sort(employees,(emp1,emp2)->emp1.getAge()<emp2.getAge()?-1:1);
		//employees.forEach(emp->System.out.println(emp.getName()));
//		employees.stream().filter(emp->emp.getCoreTech().startsWith("Java")).
//		map(emp->emp.getName().toUpperCase()).forEach(System.out::println);
//		employees.stream().filter(emp->emp.getCoreTech().startsWith("Java"))
//		.forEach(emp->System.out.println(emp.getName()+" "+emp.getAge()));
		Set<Employee>empSet = new HashSet<>();
		empSet.add(gov);
		empSet.add(vis);
		empSet.add(hasi);
		empSet.add(pranay);
		empSet.add(gova);
		empSet.forEach(emp->System.out.println(emp.getName()));
		
	}

}
class Employee implements Comparable<Employee>{
	private String name;
	private int age;
	private String coreTech;
	
	public Employee(String name, int age,String coreTech ) {
		this.name= name;
		this.age = age;
		this.coreTech = coreTech;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCoreTech() {
		return coreTech;
	}
	
	@Override
	public int compareTo(Employee emp) {
		return this.name.compareTo(emp.getName());
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null||this.getClass()!=obj.getClass()) {
			return false;
		}
		String empName = ((Employee)obj).getName();
		return this.name.equals(empName);
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode()+51;
	}


}
