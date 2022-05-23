package operatros;

public class UniaryOperator {
	public void preincrement() {
		int a = 10;
		System.out.println(++a);
		System.out.println(--a);
	}

	public void postincrement() {
		int a=10;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		

	}

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		System.out.println(a++ + ++a);// a++
		System.out.println(++b + b++);
		System.out.println(b);
		UniaryOperator un = new UniaryOperator();
		un.preincrement();
		un.postincrement();
	}
}
