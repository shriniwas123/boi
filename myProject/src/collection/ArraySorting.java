package collection;

import java.util.Arrays;



public class ArraySorting{
	 public static void main(String[] args) {
		  int [] lis=  {50,20,30,40,};
		System.out.println(Arrays.toString(lis));  
		  
		/*  for(int i=0;i<lis.length;i++) {
			  System.out.println(lis[i]);
			
		  }*/
		Arrays.sort(lis);
		System.out.println(Arrays.toString(lis));
		//Arrays.equals(null, 0, 0, null, 0, 0, null)
	}
	 
 }

