package inheritance1;

public class NokiaAndroidnew extends NokiaAndsroid{
	void sensor() {
		System.out.println("now we add finger print security .");
	}
	public static void main(String[] args) {
		NokiaAndroidnew nokia = new NokiaAndroidnew();
		nokia.calling();
		nokia.tochAndCamera();
		nokia.sensor();
		
	}

}
