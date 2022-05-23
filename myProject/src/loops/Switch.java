package loops;

public class Switch {
	
	public static void main(String [] args) {
		
		int a =2 ;
		System.out.println(a + "day is");
		switch(a) {
		case 1 :
			System.out.println("Sunday"); 
			break;
		case 2: 
			System.out.println("maonday");
			break;
		case 3 : 
			System.out.println("tuesday");
            break;    		
		case 4:
			System.out.println("wensday");
			break;
		case 5: 
			System.out.println("thursday");
			break;
		case 6 :
			System.out.println("friday");
			break;
		case 7: 
			System.out.println("saturday");
			break;
			
	default :
		System.out.println(" Sorry entre valid number betwwen 1 to 7");
		}
		
		
		
		
	}

}
