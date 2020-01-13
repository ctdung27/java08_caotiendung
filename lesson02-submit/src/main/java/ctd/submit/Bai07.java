package ctd.submit;

import java.util.Random;
import java.util.Vector;

public class Bai07 {
	public static void main(String[] args) {
		Random rd = new Random();
		Vector v = new Vector();
		int iNew = 0;
		for (int i= 0; i < 5;   ) {
			iNew = 20 + rd.nextInt(10);
			if (!v.contains(iNew)) {
				i++;
				v.add(iNew);
				System.out.print(iNew + " ");
			}
		}
	}
}
