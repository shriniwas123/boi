package variableTypes;

public class LocalVari {
	
	static int j=45;
	
	public void localVariable()
	{
		int a=99;
		
		
		
		int b=0;
		String c=null;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(j);
	}
	public static  void may() {
		System.out.println(j);
		
	}
public static void main (String []args) {
	LocalVari ob=new LocalVari();
	ob.localVariable();
	System.out.println(j);

}
}
