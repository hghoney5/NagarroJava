//INPUT:
//5
// OUTPUT:
//5                   5 
//5 4               4 5 
//5 4 3           3 4 5 
//5 4 3 2       2 3 4 5 
//5 4 3 2 1   1 2 3 4 5 
//5 4 3 2 1 0 1 2 3 4 5 
//5 4 3 2 1   1 2 3 4 5 
//5 4 3 2       2 3 4 5 
//5 4 3           3 4 5 
//5 4               4 5 
//5                   5 


package Test;

import java.util.Scanner;

public class PatternInvertedHourGlass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = 1;
        int nsp = 2*n-1;

        for(int row = 1; row<=2*n+1; row++)
        {
            
            int num = n;
            for(int cst = 1; cst<=nst; cst++)
            {
                System.out.print(num +" ");
                num--;
            }

            for(int csp = 1; csp<=nsp; csp++)
                System.out.print("  ");

            num++;
            int cst = 1;
            if(row==n+1)
            {
                num++; cst=2;
            }
            for(; cst<=nst; cst++)
            {
                System.out.print(num +" ");
                num++;
            }

            System.out.println();
            if(row <= (2*n)/2) {
                nst ++;
                nsp -=2;
            }
            else {
                nst --;
                nsp += 2;
            }
        }

	}

}
