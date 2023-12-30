
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
import java.util.Random;

public class OneOfEachStats {
	public static void main(String[] args) {
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		double Z = T;
		Random generator = new Random(seed);  
		double sum = 0;
		int TwoChildren = 0;
		int ThreeChildren = 0;
		int FourChildren = 0;
		int Min = 0;
		int Max = 1;
		double x = 0;
		double y = 0;
		for (int i = 0; i < T; i++) {
			x = generator.nextDouble();
			y = 0;
			Boolean boy = false; 
			Boolean girl = false;
			int boyNum = 0;
			int girlNum = 0;
			int famSize = 0;
			String fam = "";
			if (x < 0.5) {
				boy = true;
				boyNum++;
				fam = "b ";
			} else {
				girl = true;
				girlNum++;
				fam = "g ";
			}
			Boolean n = false;
			while (n == false) {
				y = generator.nextDouble();
				if (y < 0.5) {
					if ((boy == true) && (girl == false)) {
						boyNum++;
						fam = fam + "b ";
					} else if ((boy == false) && (girl == true)) {
						boyNum++;
						fam = fam + "b ";
						n = true;
					}
				}
				if (y >=0.5) {
					if ((girl == true) && (boy == false)) {
						girlNum++;
						fam = fam + "g ";
					} else if ((girl == false) && (boy == true)) {
						girlNum++;
						fam = fam + "g ";
						n = true;
					}
				}
			}
			famSize = boyNum + girlNum;
			if (famSize <= 2) {
				TwoChildren++;
				sum = sum + 2;
			} else if (famSize == 3) {
				ThreeChildren++;
				sum = sum + 3;
			} else {
				FourChildren++;
				sum = sum + famSize;
			}
		}
			System.out.println("Average: " + (sum/Z) + " children to get to at least one of each gender.");
			System.out.println("Number of families with 2 children: " + TwoChildren);
			System.out.println("Number of families with 3 children: " + ThreeChildren);
			System.out.println("Number of families with 4 or more children: " + FourChildren);
			String most = (FourChildren > Math.max(TwoChildren, ThreeChildren)) ? "4 or more" : ((ThreeChildren > TwoChildren) ? "3" : "2");
			System.out.println("The most common number of children is " + most);
	}
}
