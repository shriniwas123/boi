package methodCallingType;

public class MCWC {
	public static void eat1 (int z) 
	{
		System.out.println("i like paneer.");
     System.out.println(z);
	}
	public void drink (String a)
	{
		System.out.println("i like to drink cocacola");
	}
	public void rohan(int c) {
		System.out.println("Rohan Method");
		System.out.println(c);
		
	}
public static void main (String[]args) {
	MCWC ab= new MCWC();
	ab.drink("pepsi");
	MCWC.eat1(4);
	ab.rohan(10);
	ab.rohan(0);
}
}
