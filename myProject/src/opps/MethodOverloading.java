package opps;

public class MethodOverloading {
	public void Method1() {
		System.out.println("jdhcjds iam in 1st method");
	}
	public void Method1(int c) {
		System.out.println("method 2 with same name Different argument");
	}
	public void Method1(int b,int c) {
		System.out.println("method 3 with same name but different arguments");
		
	}
	public static void main(String[] args) {
		MethodOverloading mol= new MethodOverloading();
		mol.Method1(10);
	}

}
