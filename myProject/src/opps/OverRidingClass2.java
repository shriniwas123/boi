package opps;

public class OverRidingClass2 extends OverRidingClass1 {
	String Name = "Hariom";
	int c= 175;
	
	public  void SameMethod() {
		super.SameMethod();
		System.out.println("i am in sub class");
	}
	public void SameMethod2() {
		System.out.println("this is Sub class method");
		}
				
	
	public static void main (String [] args) {
		OverRidingClass2 ove = new OverRidingClass2();//over riding
		ove.SameMethod2();
		ove.SameMethod();
		ove.display();
	/*	System.out.println(ove.marks);
		System.out.println(ove.Name);
		OverRidingClass1 ove2 = new OverRidingClass1();//over riding
		ove2.SameMethod();
		ove2.SameMethod2();*/
		
		OverRidingClass1 abc =new OverRidingClass2(); //up casting
		abc.SameMethod();
		abc.SameMethod2();
		abc.display();
		
		System.out.println(abc.c);//variables are call from super calls only
		System.out.println(abc.Name);
		
		OverRidingClass2 amd= (OverRidingClass2)abc;
		amd.SameMethod();
		amd.display();
		
		
	
	}

}
