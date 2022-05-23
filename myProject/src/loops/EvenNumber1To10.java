package loops;

public class EvenNumber1To10 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		for(int i=2; i<=a;i++) {
			if(i%2==0) 
				b=b+i;
			
		}
		System.out.println(b);
	}

}
