
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */

import java.util.*; 

public class OneOfEach {
	public static void main (String[] args) {
		int Min = 0;
		int Max = 1;
		int x = Min + (int)(Math.random() * ((Max - Min) + 1));
		Boolean boy = false; 
		Boolean girl = false;
		List<String> y = new ArrayList<>();
		if (x == 0) {
			boy = true;
			y.add("b");
		} else {
			girl = true;
			y.add("g");
		}
		Boolean n = false;
		while (n == false) {
			x = Min + (int)(Math.random() * ((Max - Min) + 1));
			if (x == 0 && boy == false) {
				y.add("b");
			} else if ((x == 1) && (girl == false)) {
				y.add("g");
			} else {
				n = true;
			}
		}
		String yString = y.toString();
		yString = yString.replace(",", "");
		yString = yString.replace("[", "");
		yString = yString.replace("]", "");
		System.out.println(yString);
	}
}
