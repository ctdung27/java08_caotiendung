package ctd.submit;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		int n ;
		boolean r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		n = sc.nextInt();
		if (palin(n)) {
			System.out.println(n+ " là số đối xứng ");
		}else {
			System.out.println(n+ " không phải là số đối xứng ");
		}
		
	}
	public static boolean palin(int a) {
		int res = 0, tmp = a;
		while (tmp > 0) {
			res = res*10 + tmp % 10;
			tmp /=10;
		}
		if (res == a) {
			return true;
		}else {
			return false;
		}
	}
}
