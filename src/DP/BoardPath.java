package DP;

public class BoardPath {
    public static void main(String[] args) {
        int end = 20;
        int[] strg = new int[end];
        System.out.println(BoardPathRecursive(0, end));
        System.out.println(BPTD(0, end, strg));
        System.out.println(BPBU(end));
        System.out.println(BPBUSE(100000));
    }

    // Recursive function for Board Path.
    // It can work for small values as the each time calculation is done by recursion.
    // It is working for end = 20;
    // It takes time on end = 40;
    // TC: O(6^n)
    // SC: O(1) + Recursion extra space
    public static int BoardPathRecursive(int curr, int end) {
        if(curr == end)
            return 1;
        if(curr > end)
            return 0;

        int count = 0;
        for(int i=1; i<=6; i++) {
            count += BoardPathRecursive(curr + i, end);
        }

        return count;
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
    public static int BPTD(int curr, int end, int[] strg) {
        if(curr == end)
            return 1;
        if(curr > end)
            return 0;
        // check in strg before recursive calls.
        // if curr > end it is handled before it.
        if(strg[curr] != 0)
            return strg[curr];

        int count = 0;
        for(int i=1; i<=6; i++) {
            count += BPTD(curr + i, end, strg);
        }

        // store the calculation( curr -> end no. of ways) in the strg array.
        strg[curr] = count;
        return count;
    }

    // Bottom UP Approach
    // ------------------------------------
    // It uses iterative method rather than recursion in TD approach.
    // can handle larger values like end = 10^5;
    // Bottom UP steps:
    // 1. cell meaning : contains cell->end, no. of ways count;
    // 2. check space req. for extra array [n+6]
    // 3. check the dir of filling of array for the problem: RTL
    // 4. fill the base cases +BC and -BC in the array.
    // TC: O(n)
    // SP: O(n)
    public static int BPBU(int end) {

        int strg[] = new int[end + 6];
        strg[end] = 1;
        for(int i=end-1; i>=0; i--) {
            strg[i] = strg[i+1] + strg[i+2] + strg[i+3] + strg[i+4] + strg[i+5] + strg[i+6];
        }

        return strg[0];
    }

    // Bottom UP Space Efficient Approach
    // ------------------------------------
    // It uses iterative method rather than recursion in TD approach.
    // can handle larger values like end = 10^5;
    // Bottom UP steps:
    // 1. cell meaning : contains cell->end, no. of ways count;
    // 2. check space req. for extra array [6] => we need only next 6 calculations after curr.
    // 3. check the dir of filling of array for the problem: RTL
    // 4. fill the base cases +BC and -BC in the array.
    // TC: O(n)
    // SP: O(1)
    public static int BPBUSE(int end) {

        int strg[] = new int[6];
        int sum = 0;
        strg[0] = 1;
        for(int i=end-1; i>=0; i--) {
            sum = strg[0] + strg[1] + strg[2] + strg[3] + strg[4] + strg[5];

            for(int j=5; j>0; j--)
            {
                // shifts elements to right by 1 pos.
                strg[j] = strg[j-1];
            }
            strg[0] = sum;
        }

        return strg[0];
    }

}
