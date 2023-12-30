
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */

import java.util.*; 

public class OneOfEach {
	static List<String> y = new ArrayList<>();
	static List<Integer> z = new ArrayList<Integer>();
	static int TwoChildren = 0;
	static int ThreeChildren = 0;
	static int FourChildren = 0;
	static int sizeZ;
	static int sum;

	public static void main(String[] args) {
		int T = Integer.parseInt(args[0]);
		double average;
		for (int i = 0; i < T; i++) {
			Family();
		}
		int size = y.size();
		average = (double)sum/(double)T;
		System.out.println(y);
		System.out.println((double)size);
		System.out.println((double)T);
		System.out.println("Average: " + average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + TwoChildren);
		System.out.println("Number of families with 3 children: " + ThreeChildren);
		System.out.println("Number of families with 4 or more children: " + FourChildren);
		if ((TwoChildren > ThreeChildren) && (TwoChildren > FourChildren)) {
			System.out.println("The most common number of children is 2.");
		} else if ((ThreeChildren > TwoChildren) && (ThreeChildren > FourChildren)) {
			System.out.println("The most common number of children is 3.");
		} else {
			System.out.println("The most common number of children is 4 or more.");
		}	
	}
	
	static void Family() {
		int Min = 0;
		int Max = 1;
		int x = Min + (int)(Math.random() * ((Max - Min) + 1));
		Boolean boy = false; 
		Boolean girl = false;
		z.clear();
		if (x == 0) {
			boy = true;
			y.add("b");
			z.add(0);
		} else {
			girl = true;
			y.add("g");
			z.add(1);
		}
		Boolean n = false;
		while (n == false) {
			x = Min + (int)(Math.random() * ((Max - Min) + 1));
			if (x == 0) {
				if (boy == true) {
					y.add("b");
					z.add(0);
				} else if (girl == true) {
					y.add("b");
					z.add(0);
				} else {
					n = true;
				}	
			} else if (x == 1) {
				if (girl == true) {
					y.add("g");
					z.add(1);
				} else if (boy == true) {
					y.add("g");
					z.add(1);
				} else {
					n = true;
				}
			} else {
				n = true;
			}
		}
		System.out.println(y + "now");
		sizeZ = z.size();
		if (sizeZ <= 2) {
			TwoChildren++;
			sum = sum + 2;
		} else if (sizeZ == 3) {
			ThreeChildren++;
			sum = sum + 3;
		} else {
			FourChildren++;
			sum = sum + z.size();
		}
	}
}
