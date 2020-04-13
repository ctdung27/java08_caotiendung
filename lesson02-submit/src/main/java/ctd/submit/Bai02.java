package ctd.submit;
//S= 4! + 7!+ 12! + 18!
public class Bai02 {
	public static void main(String[] args) {
		long s = 0;
		int a = 4; 
		int b = 7; 
		int c = 12; 
		int d = 18; 
		s = mathematics(4) + mathematics(7) + mathematics(12) + mathematics(18);
		System.out.println(s);
	}
	public static long mathematics(int a) {
		long mathe = 1;
		if ((a == 0)||(a == 1)) {
			return mathe;
		}else {
			for (int i = 2; i <= a; i++) {
				mathe *= i;
			}
		}
		return mathe;
	}
}
