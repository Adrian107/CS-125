/**
 * A program to search for to encrypt and decrypt lines of text. See
 * CaesarCipher.txt
 * Hints: line.charAt( int ) is useful.
 * You'll need loops, and conditions and variables
 * You'll need to read the Test cases to understand how your program should work.
 * Good Programming Hints: "DRY: Don't Repeat Yourself"
 * Try to make your program as short as possible.
 * TODO: add your netid to the line below
 * @author donghan2
 */
public class CaesarCipher {

	public static void main(String[] strings) {
		//TODO: Delete the following line and write your implementation here- 
		System.out.println("Please enter the shift value (between -25..-1 and 1..25)");
		int input = TextIO.getlnInt();
		String input1 = "";
		while (Math.abs(input) != 999 && (input <= -26 || input == 0 || input >= 26)) {
			System.out.printf("%d is not a valid shift value.\n",input);
			System.out.println("Please enter the shift value (between -25..-1 and 1..25)");
			input = TextIO.getlnInt();
			if (input>=-25&&input <=-1||input <=25&&input>=1)
				break;
			
		}
		if(Math.abs(input) == 999) {
			System.out.println("Using position shift");
			System.out.println("Please enter the source text (empty line to quit)");
		}
		else {
			System.out.printf("Using shift value of %d\n",input);
			System.out.println("Please enter the source text (empty line to quit)");}
		input1 = TextIO.getlnString();			
		while (input>=-25&&input <=-1||input <=25&&input>=1){
			
			System.out.printf("Source   :%s\n",input1);
			input1 = input1.toUpperCase();
			System.out.print("Processed:");
			for (int k=0; k < input1.length(); k++) {		
				if (input1.charAt(k)>64 && input1.charAt(k)<91) {
					char letter = input1.charAt(k);
					letter = (char)((letter - 'A' + input + 26)%26 + 'A');
					TextIO.put(letter);
				}
				else 
					TextIO.put(input1.charAt(k));
			}TextIO.putln("\nPlease enter the source text (empty line to quit)");
			input1 = TextIO.getlnString();	
			if (input1.equals("")){
				TextIO.putln("Bye.");
				break;}
			else
				continue;
			}
			
		
		while(input == -999){
			
			System.out.printf("Source   :%s\n",input1);
			input1 = input1.toUpperCase();
			System.out.print("Processed:");
			for (int k=0; k < input1.length(); k++) {
				if (input1.charAt(k)>64 && input1.charAt(k)<91) {
					input = -k;
					char letter = input1.charAt(k);
					letter = (char)((letter - 'A' + input + 130)%26 + 'A');
					TextIO.put(letter);
				}
				else
					TextIO.put(input1.charAt(k));
			}
			TextIO.putln("\nPlease enter the source text (empty line to quit)");
			input1 = TextIO.getlnString();
			if (input1.equals("")){
				TextIO.putln("Bye.");
				break;}
			else
				continue;
		}
			while(input == 999){
			
			System.out.printf("Source   :%s\n",input1);
			input1 = input1.toUpperCase();
			System.out.print("Processed:");
			for (int k=0; k < input1.length(); k++) {		
				if (input1.charAt(k)>64 && input1.charAt(k)<91) {
					input = k;
					char letter = input1.charAt(k);
					letter = (char)((letter - 'A' + input + 26)%26 + 'A');
					TextIO.put(letter);
				}
				else 
					TextIO.put(input1.charAt(k));
			}
			TextIO.putln("\nPlease enter the source text (empty line to quit)");
			input1 = TextIO.getlnString();	
			if (input1.equals("")){
				TextIO.putln("Bye.");
				break;}
			
			}
			
	}

}
