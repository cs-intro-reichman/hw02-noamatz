/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
 
import java.util.*;

public class InOrder {
	public static void main (String[] args) {
		int Min = 0;
		int Max = 10;
		List<Integer> y = new ArrayList<Integer>();
		Boolean n = true;
		int x = Min + (int)(Math.random() * (Max - Min));
		y.add(x);
		int z;
		while (n==true) {
		z = Min + (int)(Math.random() * (Max - Min));
			if (z >= x) {
				y.add(z);
				x = z;
			} else {
				n = false;
			}
		}
		int size = y.size();
		String yString = y.toString();
		yString = yString.replace(",", "");
		yString = yString.replace("[", "");
		yString = yString.replace("]", "");
		System.out.println(yString);
	}	
}
