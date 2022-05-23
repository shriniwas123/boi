package loops;

public class Factorial {
	public static void main (String [] args) {
		int n =6;
		int k=1;
		for(int i=n;i >=1;i--) {
			k=k*i;
		}
		System.out.println("Facorial of " + n+ " =" +k );
	}

}
