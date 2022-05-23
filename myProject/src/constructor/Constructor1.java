package constructor;

public class Constructor1 {
	
	int a;
	int b;
	
	  Constructor1()
	{
		a=10;
		b=50;
		
	System.out.println(a);
	}
	  Constructor1(int cb)
		{
			a=10;
			b=50;
			
		System.out.println("object i");
		}
	  Constructor1(int cb, int cd)
		{
			
		System.out.println(cd+cb);
		}
	  Constructor1(String b ,String n){
		  System.out.println(b+n);
		  }
public static void main(String[] args) {
	Constructor1 a =new Constructor1(10);
	
  //   new Constructor1();
	new Constructor1(55);
	new Constructor1("rohit","shri");
	new Constructor1(55,59);

	
}

}
