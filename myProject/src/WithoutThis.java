
public class WithoutThis {
	int a=10;
	int b=5;
	public void sample(int a, int b) {
		a=a;
		b=b;
		System.out.println(a);
		System.out.println(b);
	}
	public void boi() {
		
		System.out.println(a);
		System.out.println(b);
	}
	public static void main (String[]args) {
		WithoutThis s= new WithoutThis();
		
		s.sample(30,40);
		s.boi();
		s.sample(30,40);
	}

}



