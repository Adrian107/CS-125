/**
 * A program to run a simple survey and report the results. See MovieSurvey.txt
 * for more information. TODO: add your netid to the line below
 * 
 * @author donghan2
 */
public class MovieSurvey {
	public static void main(String[] arg) {
		TextIO.putln("Welcome. We're interested in how people are watching movies this year.");
		TextIO.putln("Thanks for your time. - The WRITERS GUILD OF AMERICA.");
		TextIO.putln("Please tell us about how you've watched movies in the last month.");
		TextIO.putln("How many movies have you seen at the cinema?");
		TextIO.putln("How many movies have you seen using a DVD or VHS player?");
		TextIO.putln("How many movies have you seen using a Computer?");
		int nofcinema = TextIO.getlnInt();
		int nofDVD = TextIO.getlnInt();
		int nofPC = TextIO.getlnInt();
		int sum = nofcinema + nofDVD + nofPC;
		double fraction = 0.0;
		fraction = (float)nofcinema / sum;
		double fraction1 = fraction*100;
		System.out.printf("Summary: %d Cinema movies, %d DVD/VHS movies, %d Computer movies\n",nofcinema,nofDVD,nofPC);
		// TODO: Write your program here
		System.out.printf("Total: %d movies\n", sum );
		TextIO.putf("Fraction of movies seen at a cinema: %.2f%%\n",fraction1); 
		TextIO.putf("Fraction of movies seen outside of a cinema: %.02f%%",(1.00-fraction)*100);
		// Hints :
		// Formatted output
		// http://math.hws.edu/javanotes/c2/s4.html#basics.4.4
		
		// Don't just copy paste the expected output
		// For grading purposes your code may be tested
		// with other input values.
	}
}
