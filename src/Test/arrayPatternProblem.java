//n = 4
//3
//4
//6
//2
//    *   
//    *   
//  * *   
//* * *   
//* * * * 
//* * * * 

package Test;

import java.util.Scanner;

public class arrayPatternProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		int max = 0;
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
			if(a[i]>max)
				max = a[i];
		}
		
		for(int row=max; row>=1; row--)
		{
			for(int col=0; col<n; col++)
			{
				if(row <= a[col])
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}

}
