
public class ArmStrongNumber {
	public static void main (String[]args) {
		int num =370;
		double rev=0;
		int reminder;
		int check=num;
		 
		while(num != 0) {
			reminder =num%10;
			rev=rev+(reminder*reminder*reminder);
			num=num/10;
		}
		if (check==rev)
			System.out.println(check + "is Aremstrong");
		else
			System.out.println(check+"is not arm strong");
		
	}
	
	
	
	
	
	

}
