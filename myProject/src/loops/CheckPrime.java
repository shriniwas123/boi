package loops;

public class CheckPrime {
	public static void main (String [] args) {
		int n=96;
		int b=0;
		for (int i=1;i<=n;i++) {
			if (n%i==0) {
				b++;
				}
		}
				if (b==2) {
					System.out.println(n + "  is prime number");
				}
				else {
					System.out.println(n + " is non prime");
				}
			}
			
		}
	


