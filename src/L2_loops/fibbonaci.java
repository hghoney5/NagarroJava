package L2_loops;

import java.util.Scanner;

public class fibbonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0, b = 1, sum = 0;
		for(int i=0; i<n-1; i++)
		{
			sum = a + b;
			a = b;
			b = sum;
			
		}
		System.out.println(sum);
	}

}
