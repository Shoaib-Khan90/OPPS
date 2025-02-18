package OOPS;
class Airway{
	String ticket;
	String traval;
	void x(){
		System.out.println("Airway =" + " ticket :"  + ticket + " traval :" + traval);
	}
}

class Train extends Airway{
	String speed;
	String time;
	String ticket;
	void y() {
		System.out.println("Train =" +"speed :"+ speed + "  time :" + time + "  ticket :" + ticket);
	}
}

public class ClassAirway{
	public static void main(String[]args) {
	Train x = new Train();
	x.ticket="500";
	x.traval="3 hours";
	x.x();
	
	}
}


