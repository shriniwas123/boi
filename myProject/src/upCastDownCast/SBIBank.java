package upCastDownCast;

public class SBIBank extends Father {
	public void checkBalanc() {
		System.out.println("My Sbi bank Have 3000rs.");
	}
	public void GoldLoan() {
		System.out.println("I have 70000 gold loan.");
	}
	public static void main(String []args) {
	Father F=new SBIBank();
	F.checkBalance();
	F.kuldip();
	SBIBank S =new SBIBank();
	S.checkBalance();
	
	SBIBank K= (SBIBank)F;
	
	 


	
	}
}
