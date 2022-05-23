package loops;

public class PrimeOrNot {
	public static void main(String[]args) {
		int b=100,flag=0;
		for (int i=2;i<=b;i++) { //1<=10-----1
			for (int j=2;j<i;j++) { //2<2--false,2<3,3<3--flase,
				if (i%j==0) {
					flag++;
					
				}
			}
			if (flag == 0) {
				System.out.println (i);
			}
			else {
				flag=0;
			}
		}
		
		
	}	
}