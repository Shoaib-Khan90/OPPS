package OOPS;
class electrical{
	String section;
	String student;
	String subject;
	
	void displayInfo() { 
		System.out.println("section :" + section + "student :" + student + "subject :" + subject);
	}
}

	public class ClassElectrical{
		public static void main (String[] args){
		electrical myelectrical= new electrical();
		myelectrical.section=" A  ";
		myelectrical.student=" 45  ";
		myelectrical.subject=" computer science";
		
		myelectrical.displayInfo();
	}
	}

