package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author Eric Paiz
 */
// Student becomes concrete child class of the abstract Person class
public class Student extends Person {
	// ToDo 1: Make this class a child of Person

	// ToDo 2: Fix the resulting errors

	private double gpa;
	public Student(String name, short age){
		super(name, age);
    }

	// toString method that returns the student's information in a specific format
	@Override
	public String toString() {
		return "Student{" + "name=" + super.getName() + ", age=" + super.getAge() + '}';
	}
	// ToDo 3: Add a field for GPA and create setter and getter

	// gpa mutator
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	// gpa accessor
	public double getGpa() {
		return gpa;
	}


	// address accessor
	@Override
	public String getAddress() {
		return address;
	}

	// address mutator
	@Override
	public void setAddress(String address) {
		this.address = address;
	}
	// ToDo 4: Add comments to your code

}