package upCastDownCast;

public class MainBank {
	public static void main (String [] args) {
		System.out.println(" I have to check balance of all accounts.");
	
		Father B= new ICICIBank();
		B.checkBalance();
		
		Father H=new HDFCBank();
		H.checkBalance();
	
		H.checkBalance();
		
	}

}
