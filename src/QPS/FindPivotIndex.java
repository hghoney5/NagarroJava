package QPS;
// https://leetcode.com/problems/find-pivot-index/
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        System.out.println(findPivotIndex(arr));
    }

    public static int findPivotIndex(int[] arr) {
        int l = 0;
        int r = 0;
        for(int val: arr)
            r += val;
        for(int i=0; i<arr.length; i++)
        {
            r -= arr[i];
            if(l == r)
                return i;
            l += arr[i];
        }
        return -1;
    }
}
