package OOPS;

import java . util .Scanner;

public class MidCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				Scanner input=new Scanner (System.in);
				
				System.out.println("enter the word :");
				String word=input.next();
				
				int length=word.length();
				int mid =length/2;
				
				
				
				
				if(length % 2 == 0) {
					// even print two characters :
					System.out.println("middle character :" + word.charAt(word . length() / 2 - 1));
				}
				else {
					//if odd print one character:
					System.out.println("middle character : " + word.charAt(word.length()/2));
				}
			}
		
	}


