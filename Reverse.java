/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String x = args[0];
		char[] y = x.toCharArray();
		int length = x.length();
		char[] z = new char[length];
		for (int i = 0; i <= (length-1); i++) {
			z[i] = y[length-(i+1)];
		}
		System.out.println(z);
		char middle;
		int even = ((length%2) == 0) ? (length/2 - 1) : (length/2);
		middle = y[even];
		System.out.println("The middle character is " + middle);
	}
}
