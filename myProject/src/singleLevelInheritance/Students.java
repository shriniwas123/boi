package singleLevelInheritance;

public class Students extends JunaidSir {
	public void degree() {
		System.out.println("Students are graduated from differen streams.");
	}
	public static void main(String []args) {
		Students S = new Students();
		S.degree();
		S.java();
	}

}
