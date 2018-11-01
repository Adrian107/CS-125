/**
 * See CipherBreaker.txt for instructions.
 * TODO: add your netid to the line below
 * 
 * @author donghan2
 */
public class CipherBreaker {

	public static void main(String[] args) {
		TextIO.putln("Text?");
		String line = TextIO.getln();
		TextIO.putln(line);
		line = line.toUpperCase();
		String letter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";    
		char[] digit = {'0','1','2','3','4','5','6','7','8','9'};
		char[] punc = {'"','-','\'','.','!',','};
		int count1 =0;
		int count2 =0;
		int count3 =0;
		int count4 =0;
		int i = 0;
		int j = 0;
		for (; i<letter.length();i++){
			count1=0;
			for (j = 0; j<line.length();j++){
				if (line.charAt(j) == letter.charAt(i))
					count1++;
			}
			if (count1>0)
				System.out.println(letter.charAt(i)+":"+count1);
		}
		for (i=0;i<line.length();i++){
			if (line.charAt(i)==' ')
				count3++;
			for (j = 0; j<digit.length;j++){
				if (line.charAt(i) == digit[j])
					count2++;
			}
			
		}
		if (count2>0)
			System.out.println("DIGITS:"+count2);
		if (count3>0)
			System.out.println("SPACES:"+count3);
		for (i=0;i<line.length();i++){
			for (j = 0; j<punc.length;j++){
				if (line.charAt(i) == punc[j])
					count4++;
			}
		}
		if (count4>0)
			System.out.println("PUNCTUATION:"+count4);
		
	}
}