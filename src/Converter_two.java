
public class Converter_two {

	private String Ones (int num) {

		String Word = "";

		switch(num) {
		case 1: Word = "One";
		break;
		case 2: Word = "Two";
		break;
		case 3: Word = "Three";
		break;
		case 4: Word = "Four";
		break;
		case 5: Word = "Five";
		break;
		case 6: Word = "Six";
		break;
		case 7: Word = "Seven";
		break;
		case 8: Word = "Eight";
		break;
		case 9: Word = "Nine";
		break;
		case 10: Word = "Ten";
		break;
		case 11: Word = "Eleven";
		break;
		case 12: Word = "Twelve";
		break;
		case 13: Word = "Thirteen";
		break;
		case 14: Word = "Fourteen";
		break;
		case 15: Word = "Fifteen";
		break;
		case 16: Word = "Sixteen";
		break;
		case 17: Word = "Seventeen";
		break;
		case 18: Word = "Eighteen";
		break;
		case 19: Word = "Nineteen";
		break;
		}

		return Word;
	}

	private String Ty (int num) {

		String Word = "";

		switch (num) {

		case 2: Word = "Twenty";
		break;
		case 3: Word = "Thirty";
		break;
		case 4: Word = "Forty";
		break;
		case 5: Word = "Fifty";
		break;
		case 6: Word = "Sixty";
		break;
		case 7: Word = "Seventy";
		break;
		case 8: Word = "Eighty";
		break;
		case 9: Word = "Ninety";
		break;

		}
		return Word;
	}


	public String convert_num (int num) {
		
		
		String Answer = "";
		
		if (num >= 1000 & num <= 9999) {
			
			Answer += Ones(num/1000) + " Thousand ";
			num = num - (num/1000*1000);
		}
		
		if (num >=100 & num <= 1000) {
			
			Answer += Ones(num/100) + " Hundred ";
			num = num - (num/100*100);
			
		}
		
		if (num >= 20 & num < 100) {
			
			Answer += Ty(num/10) + " ";
			num = num - (num/10*10);
		}
		
		if (num < 20) {
			
			Answer += Ones(num);
			
		}
		
		System.out.println(Answer);
		return Answer;
	
	}
	


}
	

