package polymororphismOverLoading;

public class Overloading {
	public void supriya() {
		System.out.println("Supriya ghule");
		char a='4';
		System.out.println(a);
		
	}
	public void supriya(String a) {
		System.out.println("Supriya Mare");
		
	}
public void supriya(String a , int c) {
	System.out.println("Supriya mare roll no. 50");
		
	}

	public static void main (String [] args) {
		Overloading O= new Overloading();
		O.supriya();
		O.supriya("mare");
		O.supriya("mare", 50   );
		//System.out.println('r');
		
		
	}

}
