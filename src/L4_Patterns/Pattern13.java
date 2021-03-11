package L4_Patterns;

public class Pattern13 {
	public static void main(String[] args) {
		int n = 4;
		int nst = 1;
		int nsp = n-1;
		for(int row = 1; row<=2*n-1; row++)
		{
			for(int csp=1; csp<=nsp; csp++)
			{
				System.out.print(" ");
			}
			for(int cst=1; cst<=nst; cst++) 
			{
				System.out.print("* ");
			}
			System.out.println();
			if(row < n)
				nst++;
			else 
				nst--;
		}
	}
}
