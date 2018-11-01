/**
 * Prints sum of odd numbers in a specific format.
 * TODO: add your netid to the line below
 * @author donghan2
 */
public class OddSum { 
/**
Example output if user enters 10:
Max?
1 + 3 + 5 + 7 + 9 = 25
25 = 9 + 7 + 5 + 3 + 1

Example output if user enters 11:
Max?
1 + 3 + 5 + 7 + 9 + 11 = 36
36 = 11 + 9 + 7 + 5 + 3 + 1

 */
 public static void main(String[] args) { 
	 TextIO.putln("Max?");
	 int input = TextIO.getlnInt();
	 int sum = 0;
	 for (int i =1;i<=input;i=i+2){
		 if (input%2 == 0){
			 sum = sum+i;
		 }
		 else
			 sum = sum+i;
		 	 if (i == 1)
		 		TextIO.put(i);
		 	 else if (i > 1) 
		 	    TextIO.put(" + " + i);
	 }
	 TextIO.put(" = "+sum + "\n");
	 
	 TextIO.put(sum+ " = ");
	 for (int i = input;i>0;i=i-2){
		 if (i%2 == 0){
			 i = i-1;
			 sum = sum+i;
		 }
		 else
			 sum = sum+i;
		 	 if (i == 1)
		 		TextIO.put(i);
		 	 else if (i>1)
		 		 TextIO.put(i+" + ");
	 }


	 
	 
  } // end of main method
} // end of class 
