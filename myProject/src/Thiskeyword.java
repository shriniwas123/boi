
public class Thiskeyword {
	int a=10;
	int b=5;
	public void sample(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println(a);
		System.out.println(b);
	}
	public void boi() {
		
		System.out.println(a);
		System.out.println(b);
	}
	public static void main (String[]args) {
		Thiskeyword s= new Thiskeyword();
		s.boi();
		s.sample(30,40);
		s.boi();
		s.sample(30,40);
	}

}
