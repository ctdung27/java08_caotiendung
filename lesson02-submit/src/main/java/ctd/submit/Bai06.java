package ctd.submit;

public class Bai06 {
	public static void main(String[] args) {
		int n = 200;
		int dem = 0;
		int i = 1 ;
		while (dem < n) {
			i++;
            if (checkPrime(i)) {
                dem++;
            }
        }
		 System.out.println("Số Nguyên Tố Thứ 200: "+i);
	}
	public static boolean checkPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
