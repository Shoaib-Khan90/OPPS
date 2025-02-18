package OOPS;

class AC {
	String make;
	String model;
	int year;
	// Method to display car details
	void displayInfo() {
	System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
	}
	}
	public class ClassAndObject {
	public static void main(String[] args) {
	// Creating an object of the Car class
	AC myAC = new AC();
	myAC.make = "COMPANY";
	myAC.model = "HAIER";
	myAC.year = 2004;
	// Calling the method on the object
	myAC.displayInfo();
	}
	}
