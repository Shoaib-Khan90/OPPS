package OOPS;
class house{
	String rent;
	String colour;
	String bill;
	void displayInfo() {
		System.out.println("rent :" + rent);
		System.out.println("colour :" + colour);
		System.out.println("bill :" + bill);
	}
}
 
public class ClassHouse{
	public static void main (String[] args) {
		house myhouse=new house();
		myhouse.rent="25000";
		myhouse.colour=	"blue";
		myhouse.bill="5000";
		
		myhouse.displayInfo();
				}
}

