package methodCallingType;
	
 class Class1 {
	 
	public static void Static1 ()
	{
		System.out.println("i am in static1 method.");
		
		Class1 ab= new Class1();
		ab.nStatic2();
	}
	public void nStatic2() {
		
		System.out.println("i am in non static 2.");
		
	}

}

