package controlStatement;

public class FindHighestnumber {
	static public void main (String [] args) {
	
	int a=200;
	int b=500;
	int c= 600 ;
			
	if (a>=b && a>=c) {
		System.out.println("greatest number is: "+ a);
	}
	else if (b>=a && b>=c) {
		System.out.println("greatest number is : "+ b);
		
	
	}
	else { System.out.println("greatest number is :"+c);
	}
}
}   