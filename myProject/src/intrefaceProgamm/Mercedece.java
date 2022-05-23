package intrefaceProgamm;

public class Mercedece implements Key,Tyres {

	@Override
	public void TheEngine() {
		Engine.Engineparts();
		System.out.println(" Now Asseemble Engine Parts.");
		
	}

	@Override
	public void TheKey() {
		System.out.println(" now turn on key Engine will start.");
		
	}

	@Override
	public void TheTyre() {
		System.out.println("Now Tyres aare fit");
		
	}


	
	

}
