package encapsulation;

public class Encapsulation {
	private double Balance =20000;

	
	
	public void setBal(double addmoney) {
		this.Balance=addmoney+Balance;
		
	}
	public void setAfterwithdwa(double Removemoney) {
		this.Balance=Balance-Removemoney;
	}
public double getBalnce() {
	return Balance;
	
	
}
}

