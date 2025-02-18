package OOPS;
import java.util.Scanner;
class multi{
	void displayInfo(int a, int b) {
		System.out.println("multi :" + (a*b));
	}
}

class divi{
	void display(int c, int d) {
		System.out.println("division :" + (c/d));
	}
}

public class ClassOperators{
	public static void main(String [] args) {
		multi mymulti=new multi();
		divi mydivi=new divi();
		Scanner x=new Scanner (System.in);
		
		System.out.println("enter the first num :");
		int firstnum=x.nextInt();
		
		System.out.println("enter the second num :");
		int sn=x.nextInt();
		
		mymulti.displayInfo(firstnum, sn);
		mydivi.display(firstnum, sn);		
	}
}

