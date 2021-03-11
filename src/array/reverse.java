package array;

import java.util.Scanner;

public class reverse {
	public static Scanner sc = new Scanner(System.in);
	
    public static void main(String args[]) {
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        takeInput(arr);
        display(arr);
        reverse(arr);
        display(arr);
    }
    
    public static void display(int[] arr)
    {
    	for(int i=0; i<arr.length; i++)
    		System.out.print(arr[i] + " ");
    	System.out.println();
    }

    
    public static void takeInput(int[] arr)
    {
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();
    }

    public static void reverse(int[] arr)
    {
        for(int i = 0; i<arr.length/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-i-1] = temp;
        }
    }
}
