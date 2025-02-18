package OOPS;

//import java . util .Scanner;
//
//class Bankaccount{
//
//	private double balance;
//	
//	public Bankaccount(double initialbalance) {
//	
//		balance=initialbalance;
//	}
//	
//	public void deposit(double amount) {
//		
//		if(amount>0) {
//		
//			balance+=amount;
//		}
//	}
//	
//	public double getbalance() {
//		
//		return balance;
//	}
//	
//}
//
//
//public class Encapsulation {
//
//	public static void main (String [] args) {
//		
//		Scanner x=new Scanner (System.in);
//		
//		System.out.println("Enter the first amount :");
//		double firstamount=x.nextDouble();
//		
//		System.out.println("Enter the second amount :");
//		double secondamount=x.nextDouble();
//		
//		Bankaccount myaccount=new Bankaccount(firstamount);
//		
//		myaccount.deposit(secondamount);
//		
//		System.out.println("Balance :" + myaccount.getbalance());
//	}
//}


//Game

//////////////////////////////////////////////////////////////

import java . util .Scanner; 

 class Games{
	 
private  String name;

public Games(String initialname) {
	
	name=initialname;
}

public void deposit(String Name) {
	
	name+=Name;
}

public String getname() {
	
	return name;
}
 }
 
 public class Encapsulation{
	 
	 public static void main (String [] args ) {
		 
		 Scanner x= new Scanner (System.in);
		 
		 System.out.println("Enter the first game :");
		 String fgame = x.next();
		 
		 System.out.println(" Enter the second game :");
		 String sgame=x.next();
		 
		 Games mygame=new Games(fgame);
		 
		 mygame.deposit(sgame);
		 
		 System.out.println(" My Game is :" + mygame.getname());
	 }
 }

