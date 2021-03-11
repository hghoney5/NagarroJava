package Test;

import java.util.Scanner;

public class CharacterPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 1;
        for(int row = 1; row<=n; row++)
        {
            if(row%2 == 0)
                c = 2;
            else
                c = 1;
            for(int col=1; col<=row; col++)
            {
                System.out.print((char)(c+96)+" ");
                c+=2;
            }
            System.out.println();
            
        }

	}

}
