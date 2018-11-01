/* 
 * @author donghan2*/
public class BinarySearch {
	/** Wrapper method. Just runs the recursive search method below for the entire array*/
	public static boolean search(int[] array, int key) {
		return search(array, key, 0, array.length - 1);
	}

	/**
	 * Recursive search using Divide and Conquer approach:
	 * The given array is already sorted so we can very quickly discover if the key is in the array or not.
	 * Hint: For the recursive case check the value at (lo+hi)/2
	 * and proceed accordingly.
	 */
	static boolean search(int[] array, int key, int lo, int hi) {
		int middle = (lo+hi)/2;
		if (hi<lo){
			return false;
		}
		if (array[middle] == key){
			return true;
		}
		if (key > array[middle]){
			return search(array,key,middle+1,hi);
		}
		
		return search(array,key,lo,middle-1);
		
	
	}
}
