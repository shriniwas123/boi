package thisKeyword;

public class InvokeConstructor {
	public  InvokeConstructor() {
		this("ram",50);
		
		
		System.out.println("blank constructor");
	}
	 InvokeConstructor(int a){
		 this("ram",50);
		 
		 System.out.println("Single Argument");
		
	}
	 InvokeConstructor(String b, int c){
		 System.out.println("muliple arguments");
		 
	 }
	 public static void main (String [] Args) {
		 new  InvokeConstructor(50);
	 }

}
