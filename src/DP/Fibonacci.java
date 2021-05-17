package DP;

// Fibonacci sequence:
// 0 1 1 2 3 5 8 13 21 34  <----- sequence
// 0 1 2 3 4 5 6 7  8  9   <----- nth fib. no.
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(4));
        System.out.println(fibTD(9, new int[9+1]));
        System.out.println(fibTD(1000));
        System.out.println(fibTDSE(1000));
    }

    // Recursive
    // Bigger Problem : fib(nth)
    // Smaller Problem: fib(n-1), fib(n-2)
    // Self Work: fib(n-1) + fib(n-2);
    // Base Case: fib(0), fib(1)
    public static int fib(int n) {
        if(n == 0 || n == 1)
            return n;

        int sum = fib(n-1) + fib(n-2);

        return sum;
    }

    // ------------------------------------
    // DP concepts
    // ------------------------------------
    // We use a space to store the calculation which is used again and again helps in reducing time.


    // Top Down Approach:
    // ------------------------------------
    // We use Recursion stack with an extra array storing calculations for lesser TC.
    // Stack Overflow can occur on larger values like end = 10^5;
    // TC: O(n)
    // SP: O(n)
    public static int fibTD(int n, int[] strg) {
        if(n == 0 || n == 1)
            return n;

        if(strg[n] > 0)
            return strg[n];

        int sum = fib(n-1) + fib(n-2);

        return sum;
    }

    // Bottom UP Approach
    // ------------------------------------
    // It uses iterative method rather than recursion in TD approach.
    // can handle larger values like end = 10^5;
    // Bottom UP steps:
    // 1. cell meaning : contains nth fib no.;
    // 2. check space req. for extra array [n+1]
    // 3. check the dir of filling of array for the problem: LTR
    // 4. fill the base cases +BC and -BC in the array.
    // TC: O(n)
    // SP: O(n)
    public static int fibTD(int n) {

        int strg[] = new int[n+1];
        strg[0] = 0;
        strg[1] = 1;

        for(int i=2; i<=n; i++)
        {
            strg[i] = strg[i-1] + strg[i-2];
        }
        return strg[n];
    }

    // Bottom UP Space Efficient Approach
    // ------------------------------------
    // It uses iterative method rather than recursion in TD approach.
    // can handle larger values like end = 10^5;
    // Bottom UP steps:
    // 1. cell meaning : contains nth fib no.;
    // 2. check space req. for extra array [2]
    // 3. check the dir of filling of array for the problem: LTR
    // 4. fill the base cases +BC and -BC in the array.
    // TC: O(n)
    // SP: O(1)
    public static int fibTDSE(int n) {

        int strg[] = new int[2];
        strg[0] = 0;
        strg[1] = 1;

        for(int i=2; i<=n; i++)
        {
            int temp = strg[1];
            strg[1] = strg[0] + strg[1];
            strg[0] = temp;
        }
        return strg[1];
    }
}
