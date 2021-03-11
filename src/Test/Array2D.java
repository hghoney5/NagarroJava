package Test;

import java.util.Scanner;

public class Array2D {
	static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] arr = new int[m][n];
        takeInput(arr);
        printWaveRow(arr);
    }

    public static void takeInput(int[][] arr)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[0].length; j++)
                arr[i][j] = sc.nextInt();
        }
    }

    public static void printWaveRow(int[][] arr)
    {
        for(int r = 0; r < arr.length; r++)
        {
            for(int c = 0; c < arr[0].length; c++)
            {
                if(r%2 == 0)
                    System.out.print(arr[r][c] + ", ");
                else
                    System.out.print(arr[r][arr[0].length-1-c] + ", ");
            }
        }
        System.out.print("END");
        System.out.println();
    }
}
