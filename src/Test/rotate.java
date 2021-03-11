package Test;

import java.util.Scanner;

public class rotate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int count = 0;
		int d = n;
		while(d != 0)
		{
			d = d/10;
			count++;
		}
		System.out.println(count);

	}

}
