/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String x = args[0];
		int z = x.length();
		for (int i = 0; i < z; i++) {
			System.out.print(x.charAt((z - i) - 1));
		}
		System.out.println("");
		if ((z%2) == 0) {
			z--;
		} 
		System.out.println("The middle character is " + (x.charAt(z / 2)));
	}
}
