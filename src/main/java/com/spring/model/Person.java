package com.spring.model;

public class Person {
	private long id;
    private String firstName;
    private String lastName;
    private String address;

   

	public Person(int i, String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
		this.id=i;
		this.firstName=string;
		this.lastName=string2;
		this.address=string3;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

   
}
