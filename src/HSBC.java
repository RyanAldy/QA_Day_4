
public class HSBC {

	// This class is showing an example of the singleton data structure - only allowing to create one object/instance from this class
	
	static HSBC XYZ;
	
	// Private constructor stops 'World' creating an object from this class
	private HSBC() {
		
		
	}
	
	public static HSBC create() {
		
		if (XYZ == null)
			XYZ = new HSBC();
		
		return XYZ;
		
		
	}
	
}
