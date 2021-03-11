package Test;

import java.util.*;

public class spiralAntiClockwise {

	static Scanner sc = new Scanner(System.in);
    public static void main(String args[]) {
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        int[][] arr= new int[m][n];

//        takeInput2D(arr);
        int[][] arr = { {11, 12, 13, 14}, {21, 22, 23, 24}, {31, 32, 33, 34}, {41, 42, 43, 44} };

        spiralAnti(arr);
    }

    public static void takeInput2D(int[][] arr)
    {
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[0].length; j++)
                arr[i][j] = sc.nextInt();
    }

    public static void spiralAnti(int[][] arr)
    {
        int rMin = 0;
        int rMax = arr.length-1;
        int cMin = 0;
        int cMax = arr[0].length-1;
        int totalElem = arr.length*arr[0].length;
        int count = 0;

        while(count < totalElem) {

            for(int cs = rMin; cs <= rMax && count < totalElem; cs++)
            {
                System.out.print(arr[cs][cMin] + ", ");
                count++;
            }
            cMin++;

            for(int re = cMin; re <= cMax && count < totalElem; re++)
            {
                System.out.print(arr[rMax][re] + ", ");
                count++;
            }
            rMax--;

            for(int ce = rMax; ce >= rMin && count < totalElem; ce--)
            {
                System.out.print(arr[ce][cMax] + ", ");
                count++;
            }
            cMax--;

            for(int rs = cMax; rs>=cMin && count < totalElem; rs--)
            {
                System.out.print(arr[rMin][rs] + ", ");
                count++;
            }
            rMin++;
        }
        System.out.println("END");
    }
}
