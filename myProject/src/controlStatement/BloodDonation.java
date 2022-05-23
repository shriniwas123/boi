package controlStatement;

public class BloodDonation {
	public static void main(String [] args) {
		
	int age=17;
	int Weight=55;
	
	if (age>=18) {
		
		if (Weight>=45) {
			System.out.println("welcome your egligible for blood donation");
		}
		else 
			System.out.println("sorry your not egligible for blood donation");
	}
	else 
		System.out.println("sorry your not egligible for blood donation");
}
}
