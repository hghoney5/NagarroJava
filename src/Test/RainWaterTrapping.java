package Test;

import java.util.*;

public class RainWaterTrapping {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
//		int[] arr = takeInput();
		int[] arr = {3,0,0,2,0,4};
//		int[] arr = {0,1,0,4,1,0,1,0,1,0};
//		int[] arr = {0,  1,  0,  2,  1,  0,  1,  3,  2,  1,  2,  1};
		System.out.println(waterCollected(arr));
	}

	public static int waterCollected(int[] arr) {
			
			int units = 0;
	        int leftMax[] = new int[arr.length];
	        int rightMax[] = new int[arr.length];

	        leftMax[0] = arr[0];
	        rightMax[arr.length-1] = arr[arr.length-1];
	        for(int i=1; i<arr.length; i++)
	        {
	            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
	            rightMax[arr.length-1-i] = Math.max(arr[arr.length-1-i], rightMax[arr.length-i]);
	        }
	        display(leftMax);
	        display(rightMax);
	        for(int i=1; i<arr.length; i++)
	        {
	            if(leftMax[i] > arr[i])
	            	units += Math.min(leftMax[i], rightMax[i]) - arr[i];
	        }
	        return units;
	    }

	public static int[] takeInput() {

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();

		return arr;

	}
	
	public static void display(int[] arr) {

		for (int val : arr)
			System.out.print(val + " ");

		System.out.println();
	}

}
