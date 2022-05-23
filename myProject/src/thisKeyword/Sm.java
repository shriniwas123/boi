package thisKeyword;

public class Sm {

   
int a; //global variable/instance variable

    public void display()
	{
		 
		System.out.println("Global variable a is = "+a);
	}
	
	public void myMethod(int a)//local variable
	{
		  
		
		  System.out.println("Local variable a is = "+a);
		    
		
		  
	}
	
	
	
	public static void main(String[] args) {
		Sm d = new Sm();
		d.display();
		d.myMethod(76);
		
		
		
		
		
	}
}


