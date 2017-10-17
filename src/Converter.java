
public class Converter {

	public String convert(int x) {

		int units = x % 10;
		int tens = x / 10;

		String Text_units;
		String Text_tens;

		//		System.out.println(units);
		//		System.out.println(tens);

		switch(units) {
		case 0: 
			break;
		case 1: Text_units = "One";
		break;
		case 2: Text_units = "Two";
		break;
		case 3: Text_units = "Three";
		break;
		case 4: Text_units = "Four";
		break;
		case 5: Text_units = "Five";
		break;
		case 6: Text_units = "Six";
		break;
		case 7: Text_units = "Seven";
		break;
		case 8: Text_units = "Eight";
		break;
		case 9: Text_units = "Nine";
		break;
		}

		switch(tens) {
		case 1: Text_tens = "Ten";
		break;
		case 2: Text_tens = "Twenty";
		break;
		case 3: Text_tens = "Thirty";
		break;
		case 4: Text_tens = "Forty";
		break;
		case 5: Text_tens = "Fifty";
		break;
		case 6: Text_tens = "Sixty";
		break;
		case 7: Text_tens = "Seventy";
		break;
		case 8: Text_tens = "Eighty";
		break;
		case 9: Text_tens = "Ninety";
		break;
		}
		
		

		//		if (Text_tens == "Teens") {
		//			
		//			switch (tens) {
		//			case 1: Text_tens = "Eleven"
		//			break;
		//			case 1: Text_tens = "Eleven"
		//					break;
		//			case 1: Text_tens = "Eleven"
		//					break;
		//			case 1: Text_tens = "Eleven"
		//					break;
		//			case 1: Text_tens = "Eleven"
		//					break;
		//			case 1: Text_tens = "Eleven"
		//					break;
		//			case 1: Text_tens = "Eleven"
		//					break;
		//			}





		return Text_tens + Text_units;

		}


	}
}

