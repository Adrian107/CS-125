/* 
 * @author donghan2*/
public class MolecularSort {

	/** Sorts each xyz coordinate using it's Z value (coord[i][2] <= coord[j][2] for i<j). */
	static void sortCoordsByZ(double[][] coords) {
		// TODO: Implement this wrapper method.
		recursiveSort(coords, 0, coords.length - 1);

		//All the work is performed by recursiveSort
	}

	/**
	 * recursively sorts coordinates entries by their z value. Entries between
	 * lo and hi inclusive are considered.
	 */
	static void recursiveSort(double[][] coords, int lo, int hi) {
		// TODO: write the four lines of a recursive selection sort here.
		if ((hi==lo)==false){
			swap(coords, lo,findIndexOfZMinimum(coords,lo,hi));
			recursiveSort(coords,lo+1,hi);
		}
		else{
			;
		}
	}

	/**
	 * returns the index of the entry with the lowest Z value. Entries between
	 * lo and hi inclusive are considered.
	 */
	static int findIndexOfZMinimum(double[][] coords, int lo, int hi) {
		if ((hi == lo)==true){
			return lo;
		}
		int potentialmin = 0;
		if((hi==lo)==false){
			potentialmin = findIndexOfZMinimum(coords,lo+1,hi);
		}
		if (coords[potentialmin][2] > coords[lo][2]&&(hi==lo)==false) 
			return lo;
		else
			return potentialmin;
		 // TODO: Replace this with your three lines of recursive code
	}
	

	/* Swaps the (x,y and z) values of the i-th and j-th coordinates.*/
	static void swap(double[][] coords, int i, int j) {
		double[] x;
		x = coords[i];
		coords[i] = coords[j];
		coords[j] = x;
		// TODO: write your swap implementation here
	}
}
