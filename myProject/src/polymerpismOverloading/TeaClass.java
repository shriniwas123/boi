package polymerpismOverloading;

public class TeaClass extends MilkClass {
	public void milk() {
		System.out.println("milk is conveted to  Tea here.");
		
	}
	public static void main(String [] args) {
		TeaClass T=new TeaClass();
		T.milk();
		MilkClass m = new MilkClass();
		m.milk();
	}

}
