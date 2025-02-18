package OOPS;

class fan{
     
    boolean ison;
    boolean isof;
    void displayInfo() {
    	System.out.println("fan is on :" + ison);
    }
    	
    	void display() {
    		System.out.println("fan is off :" + isof);
    	}
}

public class  OnOffFunction{
	public static void main(String [] args) {
		fan myfan=new fan();
		myfan.ison=true;
		myfan.isof=false;
			myfan.displayInfo();
			myfan.display();
	}
}

