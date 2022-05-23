package loops;

public class StringReverse {
	public static void main(String[] args) {
		String a = "harry boi Hardy pratty chetu";
		char c = ' ';
		String reverse = "";

		for (int i = a.length() - 1; i >= 0; i--) {
			c = a.charAt(i);
			reverse = reverse + c;
		}
		System.out.println(reverse);
	}

}
