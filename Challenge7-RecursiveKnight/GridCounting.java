/* 
 * @author donghan2*/
public class GridCounting {
	/** Returns the total number of possible routes (paths) from
	 * (x,y) to (tx,ty).
	 * There are only three valid kinds of moves:
	 *  Increment x by one.
	 *  Increment x by two.
	 *  Increment y by one.
	 *  
	 *  Hint: You'll need to test two base cases.
	 */
	public static int count(int x,int y, int tx, int ty) {
		if (x>tx){
			return 0;
		}
		else if(y>ty){
			return 0;
		}
		if (x == tx){
			if(y == ty)
				return 1;
		}
	
		return count(x+ 1, y, tx, ty) + count(x+ 2, y, tx, ty) + count(x, y+ 1, tx, ty);
	}
}
