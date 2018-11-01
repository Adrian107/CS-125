/**
 * Prints out only lines that contain an email address Each printed line is
 * justified to right by prepending the text with '.' characters The minimum
 * width of the line including padding is 40 characters. See the test case for
 * example input and expected output.
 * @author donghan2
 */
class CallAStaticMethod {

	public static void main(String[] args) {

		while (!TextIO.eof()) {
			String line = TextIO.getln();
			int pat = 40-line.length();
			if (ExampleClassMethods.isEmailAddress(line)){
				for (int i = 0; i <pat;i++){
					TextIO.put(".");
				}
				TextIO.putln(line);
			}
				
			
			
			// Use ExampleClassMethods
			// 'isEmailAddress' and 'createPadding' to complete this method
		
		}

	}
}
