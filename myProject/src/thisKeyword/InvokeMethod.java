package thisKeyword;

public class InvokeMethod {
	int b;

	public void a(int b) {
		this.b = b;
		m("boi");
		km();
		System.out.println(b);
	}

	public void m(String c) {
		km();
		System.out.println(c);

	}

	public static void km() {

		int d = 30;
		System.out.println(d);
	}

	public static void main(String[] args) {
		InvokeMethod d = new InvokeMethod();
		d.a(50);
		km();
		d.m("chalo chodo yaar");
	}
}
