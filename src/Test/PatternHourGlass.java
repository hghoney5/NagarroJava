/*
 input:
 5
 output:
5 4 3 2 1 0 1 2 3 4 5 
  4 3 2 1 0 1 2 3 4 
    3 2 1 0 1 2 3 
      2 1 0 1 2 
        1 0 1 
          0 
        1 0 1 
      2 1 0 1 2 
    3 2 1 0 1 2 3 
  4 3 2 1 0 1 2 3 4 
5 4 3 2 1 0 1 2 3 4 5 
 
 */

package Test;

import java.util.Scanner;

public class PatternHourGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = 2*n+1;
        int nsp = 0;
        int val = n;
        for(int row = 1; row<=2*n+1; row++)
        {
            for(int csp = 1; csp<=nsp; csp++)
                System.out.print("  ");
            
            int num = val;
            for(int cst = 1; cst<=nst; cst++)
            {
                System.out.print(num +" ");
                if(cst <= nst/2)
                    num--;
                else   
                    num++;
            }


            System.out.println();
            if(row <= (2*n)/2) {
                val--;
                nst -=2;
                nsp++;
            }
            else {
                val++;
                nst +=2;
                nsp--;
            }
        }

	}

}
