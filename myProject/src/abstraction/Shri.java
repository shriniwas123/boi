package abstraction;

public class Shri {
	public void cartToGoAirport() {
		System.out.println("Shri use car to go airport.");
		Fuel F=new Car();
		F.petrol();
		F.ready();
		/*Car c =new Car();
		c.petrol();
		c.ready();*/
	}
	public void airoplaneToGoUsa() {
		System.out.println("Shri use airoplane to go USA.");
		Fuel F=new Airoplane();
		F.petrol();
		F.ready();
	/*	Airoplane A= new Airoplane();
		A.petrol();
		A.ready();
		Car c =new Car();
		c.petrol();
		c.ready();*/
	}
	}
