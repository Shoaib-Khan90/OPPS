package OOPS;


class Parents{
	void displayInfo() {
		System.out.println("The parents is good :");
	}
}

class Child extends Parents {
	void display() {
	System.out.println("The child is good :");	
	}
}

public class Inheritance {
public static void main(String [] args) {
	Child mychild=new Child ();
	
	mychild.displayInfo();
	mychild.display();
	}
}
