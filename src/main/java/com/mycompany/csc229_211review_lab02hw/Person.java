package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author Eric Paiz
 */
public abstract class Person {
	// Person member fields
	private String name;
	protected String address;
	private short age;

	// constructor that takes only two params
	public Person(String name, short age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String getAddress() ;

	public abstract void setAddress(String address);


	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

}
