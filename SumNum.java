package OOPS;



class Parent{
	void x(int a, int b) {
		System.out.println("Sum "+(a+b));
	}
	
	void x(String a, String b) {
		System.out.println(a+b);
	}
}

public class SumNum {
	public static void main(String[] args) {
		Parent object = new Parent();
		
		object.x(2, 3);
	}
}

