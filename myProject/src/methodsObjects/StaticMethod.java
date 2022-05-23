package methodsObjects;

public class StaticMethod {

	public static void hello() {
		System.out.println("i am in static method.");
	}

	public static void main(String[] areg) {
		hello();
		StaticMethod.single(); 
	}
	
	public static void single()
	{
		System.out.println("i am in static method b");
	}
}
