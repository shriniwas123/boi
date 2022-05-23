package loops;

public class Primenumber {
	public static void main (String[]args) {
		int n=100;
		int count=0;
		int i,j;
		for (i=2;i<=n;i++) {
			for (j=2;j<i;j++) {
			
				if (i%j==0)
					count++;
			}
			if (count==0)
			System.out.println(i);
				 
				
			else 
				 count=0;
				 

			}
			
		
		}
			
	}


