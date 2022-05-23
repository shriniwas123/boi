package methodsObjects;

public class NStaticMethod {
	
	public static void main(String[]args) {
		staticA();
		
		NStaticMethod A= new NStaticMethod();
		A.nstatic();
		StaticMethod.hello();
	
		
	}
	
	public static void staticA()
	{
		System.out.println("hi frinds how are you\ni think you all right.");
	}
	public void nstatic()
	{
		System.out.println(" iam in non stattic method ");
	}
}
