
public class Bank {
	
	int A;
	static int Dollar;
	
	public void SetDollar(int x) {
		
		Dollar = x;
	}

	
	public void Amount(int y) {
		
		System.out.println("Amount: " + (Dollar * y));
		
	}
	
	// This won't work as it's trying to print a non-static variable and this is a static method
	// Static can't access non-static BUT non-static can access static
	
	public static void Show() {
		
		System.out.println(A);
	}
	
}
