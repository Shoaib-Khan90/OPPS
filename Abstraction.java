package OOPS;

//abstract class Shape {
//	// Abstract method
//	abstract void draw();
//	
//	// Concrete method
//	void showShape() {
//	System.out.println("This is a shape.");
//	}
//	}
//	class Circle extends Shape {
//	// Implementing the abstract method
//	void draw() {
//	System.out.println("Drawing a circle.");
//	}
//	}
//	public class Abstraction {
//	public static void main(String[] args) {
//	Shape myCircle = new Circle();
//	myCircle.draw(); // Calls the draw method of Circle class
//	myCircle.showShape(); // Calls the concrete method of Shape class
//	}
//	}
 

///////////////////////////////////////////////////////////////////////////////////////


abstract class Vehicle{
	abstract void start();
	
	void stop(){
		System.out.println(" The vehicle is stopping :");
	}
}


  class Car extends Vehicle{
	void start() {
		System.out.println("The car is starting :");
	}
}

 public class Abstraction{
	 public static void main (String [] args ) {
		 
		 Car mycar=new Car ();
		 mycar.start();
		 mycar.stop();
	 }
 }

