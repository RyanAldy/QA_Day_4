
public class QAd {

	// Example of how to call constrcutors using this
	
	public QAd () {
		
		// Call to next constructor
		this(7);
		
		System.out.println("ABC");
	}
	
	public QAd (int A) {
		
		// Call to next constructor
		this(6,12);
		System.out.println("XYZ");
	}
	
	public QAd (int A, int B) {
		
		System.out.println("123");
	}
	
}
