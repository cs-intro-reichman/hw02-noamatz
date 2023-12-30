/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
 

public class Perfect {
	public static void main (String[] args) {
		int x = Integer.parseInt(args[0]);
		int y = 0;
		String Print = "";
		for (int i = 1; i <= (x-1); i++) {
			if ((x % i) == 0) {
				y = y + i;
				if (i != 1) {
					Print = Print + " + " + i;
				} else {
					Print = "" + i;
				}
			}
		}
		Boolean n = true;
		n = (y == x) ? true : false;
		if (n==true) {
			System.out.println(x + " is a perfect number since " + x + " = " + Print);
		} else {
			System.out.println(x + " is not a perfect number");
		}
	}
}
