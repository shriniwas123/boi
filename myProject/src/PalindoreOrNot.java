import java.util.*;
public class PalindoreOrNot {
	
	public static void main(String[] args) {
	System.out.println("Enter number");
		Scanner Sc =new Scanner (System.in);
		int B=Sc.nextInt();
			Sc.close();
		
		
		int b=0;
		int rev =0;
		int check =B;
		while(B>0) {
			b=B%10;
			rev=rev*10+b;
			B=B/10;
		}
		if (rev==check)
			System.out.println("number is palindore"+check);
		else
			System.out.println("number id not palindore"+check);
		
	}

}
