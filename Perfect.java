/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
 
import java.util.*; 

public class Perfect {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
		List<Integer> y = new ArrayList<Integer>();
		for (int i = 1; i <= (x-1); i++) {
			if ((x % i) == 0) {
			y.add(i);
			}
		}
		int size = y.size();
		String yString = y.toString();
		yString = yString.replace(",", " +");
		yString = yString.replace("[", "");
		yString = yString.replace("]", "");
		Boolean n = true;
		int z = 0;
		for (int j = 0; j < size; j++) {
			z = z + y.get(j);
		}
		n = (z == x) ? true : false;
		if (n==true) {
			System.out.println(x + " is a perfect number since " + x + " = " + yString);
		} else {
			System.out.println(x + " is not a perfect number");
		}
	}
}
