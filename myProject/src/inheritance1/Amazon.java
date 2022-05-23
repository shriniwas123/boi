package inheritance1;

public class Amazon extends Paytm {
	void buyHeadphones() {
		System.out.println(" We can make payment buy using paytm in amazon also. ");
	}
	public static void main(String[] args) {
		
	Flipkart fk= new Flipkart();
	fk.buymobile();
	Amazon am= new Amazon();
	am.buyHeadphones();
		
	}

}
