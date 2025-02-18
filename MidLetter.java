package OOPS;
import java . util .Scanner;

public class  MidLetter{
	public static void main (String [] args ) {
		Scanner input=new Scanner (System.in);
		
		System.out.println("enter the name :");
		String name = input.next();
		
		int length=name.length();
		int mid = length/2;
		
		if(length % 2 == 0) {
			// even print two characters :
			System.out.println("middle character :" + name.charAt(mid - 1) + name .charAt(mid));
		}
		else {
			//if odd print one character:
			System.out.println("middle character : " + name.charAt(mid));
		}
	}
}


//same but in  class and object:

//import java . util .Scanner;
//class middle{
//	void displayInfo() {
//		System.out.println("the middle character is :");
//	}
//}
//
//public class MidLetter{
//	public static void main (String [] args ) {
//		middle mymiddle=new middle ();
//		
//		Scanner input=new Scanner (System.in);
//		
//		System.out.println("enter the name :");
//		String name = input.next();
//		
//		int length=name.length();
//		int mid =length/2;
//		mymiddle.displayInfo();
//		if(length % 2== 0) {
//			//if even print two character:
//			System.out.println( ""+  name .charAt(mid-1) + name.charAt(mid));
//		}
//		
//		else {
//			//if odd print one character:
//			System.out.println(name.charAt(mid));
//		}
//		}
//}

