package stringMethods;

public class CountRepeatChar {

	public static void main(String[] args) {
		char ab='s';
		int a=0;
		String s="Shriniwasa sheytye jsksjdkndknkjn kkcnjbj ";
				for (int i=0;i<=s.length()-1; i++) {
					 
					if(ab==s.charAt(i)) {
						a++;
					}
						
				
				}
				System.out.println("charector " + ab + " repeated " + a +" times");
	}

}
