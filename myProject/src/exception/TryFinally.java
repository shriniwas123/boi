package exception;

public class TryFinally {
	public static void main(String [] args) {
		String Name="Shriniwas";
		try {
		System.out.println(Name.charAt(20));
		}
		
		finally {
			System.out.println("Finally is always execute.");
		}
		System.out.println("120");
		
	}

}



