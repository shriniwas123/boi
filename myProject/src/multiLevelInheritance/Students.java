package multiLevelInheritance;

public class Students extends Selenium{
	public void degree() {
		System.out.println("Students have degree and java and selenium knowledge also.");
		
		
	}
	public static void main(String[] args) {
		
	
	Students S =new Students();
	S.java();
	S.selenium();
	S.degree();
}
}