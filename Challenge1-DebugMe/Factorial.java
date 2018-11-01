
/**
 * A program to calculate a factorial. The given code may contain errors. Fix the
 * given code and add additional code to calculate a factorial and pass the unit
 * tests. Hint sometimes an 'int' just 'aint big enough.
 * 
 * @see Factorial-ReadMe.txt for details on how to complete this program.
 * @author donghan2
 */

public class Factorial {
	public static void main(String[] args) {
		int max = 0;
		long factorial1 = 1;
		while (max <=0 || max >= 21){
			System.out.println("Enter a number between 1 and 20 inclusive.");
			max = TextIO.getlnInt();
		}
		
		for (long input = max;input>0;input--){
			factorial1 *= input; 
			
		}
		System.out.printf("%d! = %d",max,factorial1);	
				
	}			
		
}	




