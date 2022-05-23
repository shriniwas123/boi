
public class WithoutLopp1To10 {
static	int i = 1;

	public static void plus() {
	

		if (i <= 10) {
			System.out.print(" " + i);
			i++;
			plus();
			
		}
	}

	public static void main(String[] args) {

		plus();

	}
}