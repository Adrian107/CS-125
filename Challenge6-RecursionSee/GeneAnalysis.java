/**
 * @author donghan2
 *
 */
public class GeneAnalysis
{
	/** Wrapper method. Returns the length of the longest 
	 * common subsequence
	 */
	public static int score(String gene1, String gene2)
	{ 
		char[] ge1 = gene1.toCharArray();
		char[] ge2 = gene2.toCharArray();
		int leng1 = ge1.length-1;
		int leng2 = ge2.length-1;
		return score(ge1,ge2,leng1,leng2);
	}

	/** Implements longest common subsequence recursive search
The recursive case is defined as
					S(i-1, j)
S(i,j) = max {		S(i,j-1)
					S(i-1,j-1)
					S(i-1,j-1) +1 if gene1[i] = gene2[j]

NB  0<=i < gene1.length
    0<=j < gene2.length

You need to figure out the base case.
	 * */
	private static int score(char[] gene1, char[] gene2, int i, int j ){
		if (i<0||j<0){
			return 0;
		}
		int s1 = 0, s2 = 0, s3 = 0, s4 = 0, max1 = 0, max2 = 0;
		s1 = score(gene1,gene2,i-1,j);
		s2 = score(gene1,gene2,i,j-1);
		s3 = score(gene1,gene2,i-1,j-1);
		if (gene1[i] == gene2[j]){
			s4 = score(gene1,gene2,i-1,j-1) +1;
		}
		if (s1>s2){
			max1 = s1;
		}
		else{
			max1 = s2;
		}
		if (s3>s4){
			max2 = s3;
		}
		else
			max2 = s4;

		return Math.max(max1,max2);
		
	}
//	define a private recursive Class method 'score' that 
//	returns an integer the score.
//	The method should take four parameters- 
//	two char arrays and two integers (gene1,gene2,i,j)
//	i and j are the indices into gene1 and gene2 respectively.

}
// Use local variables to store a recursive result so that you  do not need to calculate it again.

// Do not use a loops.
