package methodCallingType;

public class MethodArgument {
	public static void arg1(int a) {
		System.out.println("my mobile price is: ");
		
	}
	public void arg2(String av) {
		System.out.println("My laptop model is:"+ av);
	}
	public static void main (String [] args ) {
		
		arg1(12500);
		MethodArgument am= new MethodArgument();
		am.arg2("asus tuff gaming");
	     
	
	}

}
