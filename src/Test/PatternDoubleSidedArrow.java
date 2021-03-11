package Test;
/* 

 7
            1 
        2 1   1 2 
    3 2 1       1 2 3 
4 3 2 1           1 2 3 4 
    3 2 1       1 2 3 
        2 1   1 2 
            1 
  
*/
import java.util.Scanner;

public class PatternDoubleSidedArrow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nst = 1;
        int nsp = n-1;
        int val = 1;
        for(int row = 1; row<=n; row++)
        {
        	int cst2 = 1;
        	if(row == 1 || row == n)
        	{
        		cst2 = 2;
        	}
            for(int csp = 1; csp<=nsp; csp++)
                System.out.print("  ");
            
            val = nst;
            for(int cst = 1; cst<=nst; cst++)
                System.out.print(val-- +" ");

            for(int csp = 1; csp<=n-nsp-2; csp++)
                 System.out.print("  ");

            val = 1;
            for(int cst = cst2; cst<=nst; cst++)
                System.out.print(val++ + " ");

            System.out.println();
            if(row <= n/2){
                nst++;
                nsp-= 2;
            }
            else {
                nst--;
                nsp+=2;
            }
        }

	}

}
