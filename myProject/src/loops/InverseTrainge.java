package loops;

public class InverseTrainge {
	public static void main(String[] args) {
		int j;
	
for (int i=1;i<=5;i++) {
	for ( j=0;j<=i;j++) {
		System.out.print(" ");
	}
	for (int k=5;  k>=i ;k--) {
		System.out.print("* ");
	}
	System.out.println();
}
}
}