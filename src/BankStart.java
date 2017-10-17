
public class BankStart {

	public static void main(String[] args) {
		
		Bank HSBC, Natwest, Barclays;
		
		// The static members from the Bank class aren't created inside these objects as static members are always created outside the object
		HSBC = new Bank();
		Natwest = new Bank();
		Barclays = new Bank();
		
		HSBC.SetDollar(5);
		HSBC.Amount(8);
		

	}

}
