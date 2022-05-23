
public class StringPalindrome {
	public static void main(String []args) {
		String name="nitin";
		char c=' ';
		String rev="";
		String compare=name;
		int i;
		
		for(i=name.length()-1;i>=0;i--) {
			 c=name.charAt(i);
			rev=rev+c;
		}
	
		
		System.out.println(rev);
		if (compare.equals(rev))
			System.out.println(compare+" is palondrome");
		else
			 
			System.out.println(compare+" is not palindrome");
	}

}
