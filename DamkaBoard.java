/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
 
import java.util.*; 
 
public class DamkaBoard {
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		List<String> y = new ArrayList<>();
		for (int i = 0; i < x; i++) {
			y.add("*");
		}
		for (int j = 0; j < x; j++) {
			String yString = y.toString();
			yString = yString.replace(",", "");
			yString = yString.replace("[", "");
			yString = yString.replace("]", "");
			if (j%2 == 0) {
				System.out.println(yString);
			} else {
				System.out.println(" " + yString);
			}
		}
	}
}
		