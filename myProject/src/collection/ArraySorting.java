package collection;

import java.util.Arrays;

public class ArraySorting {
	public static void main(String[] args) {
		int sum = 0;
		String[] lis = { "50", "kul", "rohit", "20", "30", "40" };

		for (int i = 0; i < lis.length; i++) {
			System.out.println(lis[i]);
			String s = lis[i];
			try {
				int num = Integer.parseInt(s);
				sum = sum + num;
			} catch (Exception e) {
				e.printStackTrace();

			}
		}
		System.out.println(sum);

	}

}
