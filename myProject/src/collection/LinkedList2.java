package collection;

import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String [] args) {
		LinkedList Lb= new LinkedList();
		Lb.add("boi");
		Lb.add(100);
		Lb.add(100);
		Lb.add("boi");
		Lb.add(100);
		Lb.add(100);
		System.out.println(Lb);
		System.out.println(Lb.get(0));
		System.out.println(Lb.get(5));
		System.out.println(Lb.remove(2));
		System.out.println(Lb);
		System.out.println(Lb.removeFirst());
		System.out.println(Lb);
	}
}