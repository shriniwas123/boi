
public class ReversStr2 {
	public static void main(String[] args) {
		String s ="rohan Sanghai Shriniwas shete";
	
		int e =s.length()-1;
		String Rev="";
		int i;
		char c=' ';
		char n ='a';
		int a=0;
		
		for(i=e;i>=0;i-- ) {
			c=s.charAt(i);
			Rev=Rev+c;
		
			if (c==n)
				a++;
			
				
			
			
		}
		System.out.println(Rev);
		System.out.println("this String contains "+ n +"="+a);
	}

}
