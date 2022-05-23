package opps;

public class ClassSub extends SingleLevInheritance {
	public void boi() {
		System.out.println("name is"+ name);
	}
	public static void main(String[] args) {
		ClassSub b= new ClassSub();
		b.SuperClass();
		System.out.println("name of student"+ b.name);
		System.out.println("percentage "+b.d);
	}
 

}
