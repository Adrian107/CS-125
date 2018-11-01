/* 
 * @author donghan2*/
public class InsecurePasswordLockBreaker {

	public static char[] breakLock(InsecurePasswordLock lock) {
		char[] key = new char[100];
		for(int i = 30; i<=50;i++){
			key = new char[i];
			if ((lock.open(key)==-1)==false){
				break;
			}
		}
		
		char[] x = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J','K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V','W', 'X', 'Y', 'Z' };
		int index = 0;
		for (int i = 0; i < 27; i++) {
			key[index] = x[i];
			if ((lock.open(key)==index)==false){
				i = -1;
				index++;
			}
			if(lock.isUnlocked()==true){
				return key;
			}
			
		}
		
		return key;
		// write code here to determine the secret password
		// to unlock the given lock object.
		// You do not need to use recursion.
		// Hint: Read the source code of InsecurePasswordLock
		// The lock has a weakness....
		// Understand it and you can write an algorithm to quickly find the
		// secret password
		// (A brute force guess of a 40 character password would take a long
		// time...
		// as there are 26^40 combinations!
		// Your method should find it in a few seconds.

		// Beginner: You should complete this code in less than an hour

		// Advanced Code-Golf: Can you complete this method in 8 lines
		// (excluding the top and bottom given
		// lines and after autoformating your code)
		
		// Crazy Instructor level:
		// I can write a complete albeit-inefficient solution using single while loop :-)
		// expression: while (____){/*NoCodeHere*/}
		
	}

	public static void main(String[] args) {
		InsecurePasswordLock lock = new InsecurePasswordLock();
		char[] key = breakLock(lock);
		System.out.println(key);
		System.out.println(lock.isUnlocked());
	}
}
