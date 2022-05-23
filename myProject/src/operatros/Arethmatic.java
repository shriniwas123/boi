package operatros;

public class Arethmatic {
	int a= 50;
	int b= 100;
	int c=5;
	
	public void addition() 
	{
		System.out.println("addition   "+    ( a+b));
	}
	public void subtract() {
		System.out.println("Subtracttion  "+ (b-a));
	}
	public void division() {
		System.out.println("division =  "+ (b/a));
	}
	public void multiply() {
		System.out.println("multiplication = "+ (b*c));
	}
	public void module() {
		System.out.println("module= reminder is  "+ (b%c));
	}
	public static void main (String [] args) {
		Arethmatic b =new Arethmatic();
		b.addition();
		b.subtract();
		b.division();
		b.multiply();
		b.module();
	}
}
