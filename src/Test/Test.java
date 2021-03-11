package Test;

import java.util.Scanner;

public class Test {

	    static Scanner scn = new Scanner(System.in);
	    public static void main(String args[]) {
//	        int arr[] = takeInput();
	    	int arr[] = {1,2,0,2,1,0,1,2,1,1,1,0,0};

	        int i = 0; 
	        int j = arr.length-1;
	        int c2 = 0;
	        while(i<=j)
	        {
	            if(arr[i] <= 1)
	                i++;
	            else if(arr[j] == 2)
	            {
	                j--;
	                c2++;
	            }
	            else
	            {
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp; 
	                i++;
	                j--;
	                c2++;
	            }
	        }
	        display(arr);
	        i = 0; 
	        j = arr.length-1-c2;
	        System.out.println("START I,J , count= " + i + ", " + j + ", " + c2);
	        while(i<j)
	        {
	            if(arr[i] == 0)
	                i++;
	            else if(arr[j] == 1)
	                j--;
	            else
	            {
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp; 
	                i++;
	                j--;
	            }
	            System.out.println("val I,J = " + i + ", " + j);
	        }

	        display(arr);
	    }

	    public static int[] takeInput() {

			int n = scn.nextInt();

			int[] arr = new int[n];

			for (int i = 0; i < arr.length; i++)
				arr[i] = scn.nextInt();

			return arr;

		}

		public static void display(int[] arr) {

			for (int val : arr)
				System.out.print(val + " ");

			System.out.println();
		}


}
