package operatros;

public class Andand {

	public static void main(String[] args) {
	int	a=20;
		int b=90;
		System.out.println("=================logical && operator===========================");
		 System.out.println(a<b && b<a);// true -- false  = false
		 System.out.println(a<b && b>a);//true ---true  = true
		 System.out.println(a>b && a<b);// false ---true--=false
		 System.out.println(b<a && a>b);//false ---false --= false
		 System.out.println("==============================================================================");
		 System.out.println("bitwise & operator"); 
		 System.out.println(a<b&b>a);
		 System.out.println(a>b & b>a);
		 System.out.println(a<b & b<a);
		 System.out.println(a>b & b<a);
		 System.out.println("===========================Logical OR opretor===========================");
		 System.out.println(a<b||b<a);//true---false--->true
		 System.out.println(a<b||b>a);//true ----->true---true
		 System.out.println(a>b||b>a);//false---true----true
		 System.out.println(a>b||b<a);//false----false---false
		 System.out.println("===============bitwise Or operator===============================");
		 System.out.println(a<b|b<a);//true---false--->true
		 System.out.println(a<b|b>a);//true ----->true---true
		 System.out.println(a>b|b>a);//false---true----true
		 System.out.println(a>b|b<a);//false----false---false
	}

} 
