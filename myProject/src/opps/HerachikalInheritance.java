package opps;

public class HerachikalInheritance extends SingleLevInheritance {
	public void Class3() {
		System.out.println("Herachical Inheritance");
	}
    public static void main(String[] args) {
    	HerachikalInheritance  her= new HerachikalInheritance ();
    	her.SuperClass();
    	System.out.println("my name is"+ her.name);
    	System.out.println("My percentage "+ her.Marks);
		
	}
}
