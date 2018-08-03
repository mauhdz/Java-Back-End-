package com.example.pkg;

public class Customer {
	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Customer(Person person) {
		super();
		this.person = person;
	}
	
	public Customer(){
		
	}
	
	
	
}
