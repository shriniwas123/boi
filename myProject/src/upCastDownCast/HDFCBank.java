package upCastDownCast;

public class HDFCBank extends Father {
	public void checkBalance() {
		System.out.println("My HDFC bank have 1lac rs.");
	}
	public void loan() {
		System.out.println("i have to pay 10000 rs to Hdfc.");
	}
	public static void main(String[] args) {
		Father P = new HDFCBank(); // upcasting
		P.checkBalance();
		P.rohit();
		HDFCBank b = (HDFCBank) P;// down casting
		HDFCBank c= new HDFCBank();// inheritance
		b.checkBalance();
		b.rohit();
		b.loan();
		
	}
	

}
