package upCastDownCast;

public class OldNokiaPhone extends Mobile {
	public void simCard() {
		System.out.println("Nokia Phone Required big sim Card.");
	}
	public void battery() {
		System.out.println("Nokia Phone Required removable battery");
	}
           public static void main (String [] args) {
        	   System.out.println("i want to make call from nokia phone.");
        	   Mobile M= new OldNokiaPhone();
        	   M.simCard();
        	   M.battery();
        	   M.MakeCall();
	
}
}
