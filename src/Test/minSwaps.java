package Test;
import java.util.*;
public class minSwaps {

	static Scanner sc = new Scanner(System.in);
    public static void main (String args[]) {
//        int n = sc.nextInt();
//        int[] arr = takeInput(n);
        int[] arr = {4,3,1,2};

        System.out.println(minSwaps(arr));
    }

    public static int minSwaps(int[] arr)
    {
        int swapCount = 0;
        int i = 0;
        int j = arr.length-1;
        int[] pos = new int[arr.length];

        for(int x=0; x<arr.length; x++)
        {
            pos[arr[x]-1] = x;
        }
        // display(pos);

        for(int x=0; x<arr.length; x++)
        {
            if(pos[x] != x)
            {
                swapCount++;
                
                pos[arr[x]-1] = pos[x];
                pos[x] = x;
                int temp = arr[x];
                arr[x] = x+1;
                arr[pos[temp-1]] = temp;
            }
//            System.out.print("x:" + x + " pos=> ");
//            display(pos);
//            display(arr);
//            System.out.println();
        }

        return swapCount;
    }

    public static int[] takeInput(int n)
    {
       
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        return arr;
    }

    public static void display(int[] arr) {

        for (int val : arr)
            System.out.print(val + " ");

        System.out.println();
    }
}
