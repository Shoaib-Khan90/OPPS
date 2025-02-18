package OOPS;



class colour{
	void displayInfo() {
		System.out.println("colour is blue");
	}
}

class flovoure extends colour{
	void displayInfo() {
		System.out.println("the faloure is good ");
	}
}

public class Polymorpism {
	public static void main(String[]args) {
		flovoure input=new flovoure();
		input. displayInfo();
		
	}
}
