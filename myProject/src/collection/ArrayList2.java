package collection;
import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String [] args) {
		ArrayList l=new ArrayList();
		l.add("kuldip Wdnerkar");
		l.add("Shriniwas Shete");
		l.add("Shradha Tadmare");
		l.add("Supriya Ghule");
		l.add(100);
		l.add(200);
		
		System.out.println(l);
	System.out.println(l.contains("kuldip Wdnerkar"));
	System.out.println(l.isEmpty());
    System.out.println(l.get(0));
	}

}
