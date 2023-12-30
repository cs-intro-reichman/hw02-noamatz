
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
import java.lang.Math;

public class OneOfEach {
	public static void main(String[] args) {
		int sum = 0;
		int TwoChildren = 0;
		int ThreeChildren = 0;
		int FourChildren = 0;
		int Min = 0;
		int Max = 1;
		int x = Min + (int)(Math.random() * ((Max - Min) + 1));
		Boolean boy = false; 
		Boolean girl = false;
		int boyNum = 0;
		int girlNum = 0;
		int famSize;
		String fam = "";
		if (x == 0) {
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
			x = Min + (int)(Math.random() * ((Max - Min) + 1));
			if (x == 0) {
				if (boy == true) {
					boyNum++;
					fam = fam + "b ";
				} else if (girl == true) {
					boyNum++;
					fam = fam + "b ";
				} else {
					n = true;
				}	
			} else if (x == 1) {
				if (girl == true) {
					girlNum++;
					fam = fam + "g ";
				} else if (boy == true) {
					girlNum++;
					fam = fam + "g ";
				} else {
					n = true;
				}
			} else {
				n = true;
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
		System.out.println("famSize: " + famSize);
		System.out.println("TwoChildren: " + TwoChildren);
		System.out.println("ThreeChildren: " + ThreeChildren);
		System.out.println("FourChildren: " + FourChildren);
		System.out.println("Fam: " + fam);
	}
}
