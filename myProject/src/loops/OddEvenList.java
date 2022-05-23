package loops;

public class OddEvenList {
	public static void evennumber() {
		for (int n = 1; n <= 10; n++) {

			if (n % 2 == 0) {
				System.out.println(n);
			}
		}
		}
	public void oddNumber() {
		
	for (int n = 1; n <= 10; n++) {

		if (n % 2 != 0) {
			System.out.println(n);
		}

	}
	}

	public static void main(String[] Args) {
		
	evennumber();
		
		OddEvenList z=new OddEvenList();
		 z.oddNumber();
		 
	/*	System.out.println("Even number are between 1to 10");
		OddEvenList ob = new OddEvenList();
		ob.evennumber();
		System.out.println("odd number between 1 to 10");*/
		
		
	}
}

