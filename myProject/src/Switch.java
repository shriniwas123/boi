
public class Switch {
	public static void main(String[] args) {
		String s= "casting";
		switch(s) {
		case "inheritance":
			System.out.println(s+ " is  1st piller");
			break;
		case "polymorphisms":
			System.out.println(s+" is 2nd piller");
			break;
		case "casting":
			System.out.println(s+" is 3rd piller");
			break;
			
		case "abstraction":
			System.out.println(s+" is  4th piller");
			break;
		
		case "interface":
			System.out.println(s+" is 5th piller");
			break;
			
		case "encapsulation":
			System.out.println(s+" is 6th piller");
			break;
			
			default :
				System.out.println(" enter valid opps piller name");
		}
	}

}
