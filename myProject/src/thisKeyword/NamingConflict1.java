package thisKeyword;

public class NamingConflict1 {
	int a;
	
	public void NamingConflict(int a) {
		
		this.a=a;
		
		
		System.out.println(a);
	}
	public  void ab() {
		
		System.out.println( a+"addition "); 
	}
	
public static void main(String [] Args) {
	NamingConflict1  Nc= new NamingConflict1();
	Nc.ab();
	Nc.NamingConflict(50);
	Nc.ab();
}
}
