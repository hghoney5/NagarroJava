package DP;

import java.util.Arrays;

public class MazePath {
    public static void main(String[] args) {
        int n = 20;
//        System.out.println(MPRecursive(0, 0, n, n));
//        System.out.println(MPRecursivePrint(0, 0, n, n, ""));
        System.out.println(MPTD(0, 0, n, n, new int[n+1][n+1]));
        System.out.println(MPBU(n, n));
        System.out.println(MPBUSE(n, n));
    }

    // for n = 20 it takes time. TLE
    // TC: 2 ^ (er + ec)
    public static int MPRecursive(int cr, int cc, int er, int ec) {
        if(cr == er && cc == ec) {
            return 1;
        }
        if(cr > er || cc > ec)
            return 0;

        int ch = MPRecursive(cr, cc + 1, er, ec);
        int cv = MPRecursive(cr + 1, cc, er, ec);
        return ch+cv;
    }

    public static int MPRecursivePrint(int cr, int cc, int er, int ec, String str) {
        if(cr == er && cc == ec) {
            System.out.println(str);
            return 1;
        }
        if(cr > er || cc > ec)
            return 0;

        int ch = MPRecursivePrint(cr, cc + 1, er, ec, str + "H");
        int cv = MPRecursivePrint(cr + 1, cc, er, ec, str + "V");
        return ch+cv;
    }

    // TOP DOWN
    // TC: O(er*ec)
    // SC: O(er*ec) + Reccursion extra space
    // fails if Stack memory fulls.
    public static int MPTD(int cr, int cc, int er, int ec, int[][] strg) {
        if(cr == er && cc == ec)
            return 1;

        if(cr > er || cc > ec)
            return 0;

        if(strg[cr][cc] != 0)
            return strg[cr][cc];

        int ch = MPTD(cr, cc + 1, er, ec, strg);
        int cv = MPTD(cr + 1, cc, er, ec, strg);

        strg[cr][cc] = ch + cv;
        return ch+cv;
    }

    // BOTTOM UP
    // TC: O( er * ec )
    // SC: O( er * ec )
    public static int MPBU(int er, int ec) {

        int[][] strg = new int[er+2][ec+2];

        for(int row = er; row >= 0; row--) {
            for(int col = ec; col >= 0; col--) {

                if(row == er && col == ec)
                    strg[row][col] = 1;
                else
                    strg[row][col] = strg[row][col + 1] + strg[row + 1][col];
            }
        }

        return strg[0][0];
    }

    // BOTTOM UP SPACE EFFICIENT
    // we use only a row and update its contents like sliding bottom to up from the previous MPBU approach strg.
    // TC: O( er * ec )
    // SC: O( ec )
    public static int MPBUSE(int er, int ec) {
        int[] strg = new int[ec + 1];
        Arrays.fill(strg, 1);

        for(int i=er-1; i>=0; i--) {
            for(int col = ec-1; col>=0; col--) {
                // below is representation of 2D array as strg[col] = strg[row-1][col] + strg[row][col+1]
                strg[col] = strg[col] + strg[col + 1];
            }
        }

        return strg[0];
    }
}
