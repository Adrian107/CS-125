import java.util.Arrays;

public class Practice
{
	public static void main(String[] args) {
		double[] data = new double[8];
		data[0] = 4;
		data[1] = 3;
		data[2] = 2;
		data[3] = 1;
		data[4] = 8;
		data[5] = 7;
		data[6] = 6;
		data[7] = 5;
		sort(data);
		TextIO.put(Arrays.toString(data));
		
	}
	public static void sort(double[] data) {
		for(int i=0;i<data.length;i++){
			int m = i;
			for (int j=0;j<data.length;j++){
				if(data[j]<data[m]){
					m=j;
				}
			}
			TextIO.putln(i+"..");
			TextIO.putln(m);
			swap(data,i,m);
			TextIO.putln(Arrays.toString(data));
		}
		
		}
	
	public static void swap(double[] data, int i, int j) {
		double x;
		x = data[i];
		data[i] = data[j];
		data[j] = x;
	}
	
	
}