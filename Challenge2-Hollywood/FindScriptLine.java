/**
 * A program to search for specific lines and print their line number.
 * See FindScriptLine.txt for more details
 * TODO: add your netid to the line below
 * @author donghan2
 */
public class FindScriptLine {

	public static void main(String[] args) {
// TODO: Implement the functionality described in FindScriptLine.txt
// TODO: Test your code manually and using the automated unit tests in FindScriptLineTest
		System.out.println("Please enter the word(s) to search for");
		String input = TextIO.getln();
		System.out.printf("Searching for " + "'%s'\n",input);
		String inputLower = input.toLowerCase();
		TextIO.readFile("thematrix.txt");
		int lineCount = 0;
		while (TextIO.eof() == false){
			String line = TextIO.getln();
			String lineLower = line.toLowerCase();
			lineCount = lineCount + 1;
			if (lineLower.indexOf(inputLower) >= 0){
				String line1 = line.trim();
				System.out.println(lineCount+ " - " +line1);
					
			}
		}System.out.println("Done Searching for '" + input + "'");
		
		
	}

	private static String findscript(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}