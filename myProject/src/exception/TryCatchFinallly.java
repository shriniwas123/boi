package exception;

public class TryCatchFinallly {
	public static void main(String [] args) {
		String Name="Shriniwas";
		try {
		System.out.println(Name.charAt(20));
		}
		catch(Exception e) {
			e.printStackTrace();
				}
		finally {
			System.out.println("Execption is handlle.");
		}
		System.out.println("120");
		
	}

}
