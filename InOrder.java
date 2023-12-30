/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
 
import java.util.*;

public class InOrder {
	public static void main (String[] args) {
		int Min = 0;
		int Max = 10;
		int z;
		int y;
		Boolean n = true;
		int x = Min + (int)(Math.random() * (Max - Min));
		y = x;
		System.out.print(y);
		while (n==true) {
		z = Min + (int)(Math.random() * (Max - Min));
			if (z >= x) {
				System.out.print(" " + z);
				x = z;
			} else {
				n = false;
			}
		}
	}	
}
