package com.encapsulation;

public class Employee {
    String name;
	
	public String getName() {   //Automatically created by getter ande setter method
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj =new Employee();
		obj.setName("Mayuri");
		
		System.out.println(" name is : "+obj.getName());
	}

}
