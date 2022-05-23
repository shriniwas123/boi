package inheritance1;

public class NokiaAndsroid extends NokiabuttonPhone {
	void tochAndCamera() {
		System.out.println("Calling plus toch screen and photos. ");
		
	}
public static void main(String[] args) {
	NokiaAndsroid  no= new NokiaAndsroid ();
	no.calling();
	no.tochAndCamera();
	
}

}
