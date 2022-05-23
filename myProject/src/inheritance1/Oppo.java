package inheritance1;

public class Oppo extends Mobile {
	public void calling() {
		System.out.println("to call mobile required battery and sim now you will call");
		
	}
	public static void main(String[] args) {
		
		 Oppo obj= new  Oppo();
		 obj.battery();
		 obj.simcard();
		 obj.calling();
	}

}
