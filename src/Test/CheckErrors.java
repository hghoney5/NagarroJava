package Test;

import java.util.Scanner;

public class CheckErrors {

	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long sum = 0;
		long a;
		long c = 0;
		long nd = 0; // for number of digit
		long temp = n;
		while (n != 0) {
			n = n / 10;
			nd++;
		}
		n = temp;
		while (n > 0) {
			a = n % 10;
			c = c + (long) Math.pow(a, nd);
			n = n / 10;
		}
		if (temp == c)
			System.out.println("true");
		else
			System.out.println("false");
	}

}
