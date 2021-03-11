package Test;

import java.util.*;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact[] = new int[n+1];
        fact[0] = 1;
        for(int i=1; i<=n; i++)
        {
            fact[i] = fact[i-1]*i;
//            System.out.print(fact[i] + " ");
        }

        for(int row = 0; row<n; row++)
        {
            for(int col=0; col<=row; col++)
            {
            	int c = (int)fact[row]/(fact[col]*fact[row-col]);
                System.out.print(c+"\t");
            }
            System.out.println();
        }

	}

}
