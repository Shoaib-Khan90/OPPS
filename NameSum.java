package OOPS;



class animal{
	void displayInfo(int a , int b) {
		System.out.println("name :"+ (a + b));
	}
	void displayInfo(String a , String b) {
		System.out.println("name :"+ (a + b));
	}
}

public class NameSum{
	public static void main(String[]args) {
		animal input=new animal();
		input.displayInfo("Shoaib", "  Ali");
	}
}
