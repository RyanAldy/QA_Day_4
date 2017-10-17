
public class Tree {

	// An example of shadowing variables - the local always shadows the global
	
	int A, B;
	
	public void What() {
		
		int A = 10;
		System.out.println(A + " " + this.A);
		// This keyword is a reference to the current object
		this.A = 15;
//		System.out.println(A + " " + this.A);
		
	}
	
	// Created to show error - this is a static method so can't use 'this' keyword to update a non-static variable
	public static void Results() {
		
		System.out.println(this.A + this.B);
	}
	
}
