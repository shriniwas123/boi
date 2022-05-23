package variableTypes;

public class InstatntVari {
   
	int a=25;
	String b= "Shriniwas";
	boolean c= true;
	int d;
	byte z;
	boolean m;
	float k;
	double  x;
	char l;
	long g;
	short  h;
	char n;
	
//	public static void staticInstant() {   instant variable not possible calling inside static methods 
//	System.out.println(a);
//	
//	}
	
	
	
	public  void instant()

	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(z);
		System.out.println(m);
		System.out.println(k);
		System.out.println(x);
		System.out.println(g);
		System.out.println(n);
		System.out.println('7');
	
		
	}
	
	public static void main(String a []  ) {
		
		InstatntVari ad= new InstatntVari();
		ad.instant();
		
	}
	}

