
public class VariablesExample {
	// Other program features
	
	
	
	public static void main(String[] args) {
		// In Java, program execution starts in the main method.
		// In Java, variables must be declared before using them.
		
		int count;
		count = 11; // an assignment statement
		
		count = count + 10;
		
		
		System.out.println(count);
		
		
		// if statement example
		if(count == 10) {
			System.out.println("Count is ten");
		}
		
		
		// if else statement
		if(count > 10) {
			System.out.println("Count is greater than ten");
		}else {
			System.out.println("Count is less than or equal to ten");
		}
		
		
		if(count == 1) {
			System.out.println("Count is one");
		}else if(count == 2) {
			System.out.println("Count is two");
		}else if(count == 3) {
			System.out.println("Count is three");
		}else if(count == 4) {
			System.out.println("Count is four");
		}else if(count == 5) {
			System.out.println("Count is five");
		}else if(count == 6) {
			System.out.println("Count is six");
		}else if(count == 7) {
			System.out.println("Count is seven");
		}else if(count == 8) {
			System.out.println("Count is eight");
		}else if(count == 9) {
			System.out.println("Count is nine");
		}else if(count == 10) {
			System.out.println("Count is ten");
		}else {
			System.out.println("Count is greater than ten");
		}
		
		
		
		
		
		
		// switch statement example
		
		count = 1;
		System.out.println("switch example");
		switch(count) {
		case 1:
			// body of case 1. This will be executed when the value of count is 1.
			System.out.println("Count is one");
			break;
		case 2:
			// body of case 2. This will be executed when the value of count is 2.
			// This can also be executed if the case above is true and the body is missing
			// a break
			System.out.println("Count is two");
			break;
		default:
			System.out.println("Count is not one or two");
			break;
		}
		
		int score = 10;
		if(score >= 93 && score == 100) {
			System.out.println("A");
		}
		
		
		
		
		switch(score) {
		case 100:
		case 99:
		case 98:
		case 97:
		case 96:
		case 95:
		case 94:
		case 93:
			System.out.println("A");
			break;
		case 92:
		case 91:
		case 90:
		case 89:
			System.out.println("A-");
			break;			
			
			
			
		}

	}
	
	// Other program features

}
