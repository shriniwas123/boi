
public class SkipNumber {
	public static void main(String [] args) {
		for (int i=1;i<=50;i++) {// skipp karaych ah 21 to 30
		if(	i>=21 && i<=30)
				continue;
			System.out.print(  "  "+ i);
		}
		
	}

}
