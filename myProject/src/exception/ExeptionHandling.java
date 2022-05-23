package exception;

public class ExeptionHandling {
	public static void main(String []args) {
		
		/*System.out.println(1+1);
		System.out.println("2");
		System.out.println("3");*/
		try {
			int a=10;
			int b=0;
			int c= a/b;
	//	System.out.println(3/0);
	}
catch(ArithmeticException e) {
	e.printStackTrace();
}
		
		
	
	catch(Exception e) {
		
		e.printStackTrace();
	}
		/*System.out.println(5);
		System.out.println(6);
		System.out.println("7");*/
	}

}
