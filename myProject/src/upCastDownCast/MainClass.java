package upCastDownCast;

public class MainClass {
	public static void main(String [] args) {
		System.out.println("i want to make call from Samsung Phone");
	Mobile M = new NewSamsungPhone();
	M.simCard();
	M.battery();
	M.MakeCall();
	NewSamsungPhone N= new NewSamsungPhone();
	N.videoCall();
//	NewSamsungPhone N=(NewSamsungPhone)M;
 //  N.videoCall();
	
	}
}


