package casting;

public class MainMethod extends WithoutOveriding{
	public void shradhha() {
		System.out.println("Subclass methods");
	}
	public void kuldip() {
		System.out.println("WithoutOveriding");
	}
	public static void main(String[] args) {
		WithoutOveriding W= new MainMethod();
		W.kuldip();
		W.supriya();
		
	}

}
