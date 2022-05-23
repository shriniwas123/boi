package loops;

public class Traingle {
	public static void main (String args []) {
		int s;
		for (int i=1; i <=5; i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i=1;i<=5;i++) {
			for ( s=1;s<=i;s++) {
				System.out.print(" ");
			}
			for (int k=5;  k>=i ;k--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		}
	}
	
	
	
	
	
	


