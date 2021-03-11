package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOps {
	
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		// int[] a = takeInput();
		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		display(a);

		// System.out.println(maximum(a));
		// System.out.println(linearSearch(a, 80));
		// System.out.println(binarySearch(a, 25));

		// reverse(a);
		// rotate2(a, 2);

		// int[] ans = inverse(a);
		// display(ans);

		// barGraph(a);

		// subarrayPrint(a);

		// subarraySum2Loops(a);
		// System.out.println();
		// maxSubarraySum2Loops(a);

		// targetSumPair(a, 100);
		targetSumTriplet(a, 100);

	}

	public static int[] takeInput() {

		System.out.println("Size ?");
		int n = scn.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {

			System.out.println("arr[" + i + "] ?");
			arr[i] = scn.nextInt();

		}

		return arr;

	}

	public static void display(int[] arr) {

		for (int val : arr)
			System.out.print(val + " ");

		System.out.println();
	}

	public static int maximum(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max)
				max = arr[i];

		}

		return max;

	}

	public static int linearSearch(int[] arr, int item) {

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == item)
				return i;
		}

		return -1;
	}

	public static int binarySearch(int[] arr, int item) {

		int lo = 0;
		int hi = arr.length - 1;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (item > arr[mid]) // Right Side
				lo = mid + 1;
			else if (item < arr[mid]) // Left Side
				hi = mid - 1;
			else
				return mid;

		}

		return -1;

	}

	public static void reverse(int[] arr) {

		int i = 0;
		int j = arr.length - 1;

		while (i < j) {

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i = i + 1;
			j = j - 1;
		}

	}

	public static void reverse(int[] arr, int si, int ei) {

		int i = si;
		int j = ei;

		while (i < j) {

			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

			i = i + 1;
			j = j - 1;
		}

	}

	public static void rotate(int[] arr, int rot) {

		rot = rot % arr.length;

		for (int r = 1; r <= rot; r = r + 1) {

			// single rotation
			int temp = arr[arr.length - 1];

			for (int j = arr.length - 1; j >= 1; j = j - 1)
				arr[j] = arr[j - 1];

			arr[0] = temp;

		}

	}

	public static void rotate2(int[] arr, int rot) {

		rot = rot % arr.length;

		reverse(arr, 0, arr.length - rot - 1); // arr.length - rot
		reverse(arr, arr.length - rot, arr.length - 1); // rot

		reverse(arr);
	}

	public static int[] inverse(int[] arr) {

		int[] res = new int[arr.length];

		for (int i = 0; i < res.length; i++)
			res[arr[i]] = i;

		return res;

	}

	public static void barGraph(int[] arr) {

		int rows = maximum(arr);
		int cols = arr.length;

		for (int r = 1; r <= rows; r++) {

			for (int c = 0; c < cols; c++) {

				if (r <= rows - arr[c])
					System.out.print("  ");
				else
					System.out.print("| ");
			}

			System.out.println();
		}

	}

	public static void subarrayPrint(int[] arr) {

		for (int si = 0; si <= arr.length - 1; si++) {

			for (int ei = si; ei <= arr.length - 1; ei++) {

				for (int k = si; k <= ei; k++) {
					System.out.print(arr[k] + " ");
				}

				System.out.println();
			}

		}
	}

	public static void subarraySum3Loops(int[] arr) {

		for (int si = 0; si <= arr.length - 1; si++) {

			for (int ei = si; ei <= arr.length - 1; ei++) {

				int sum = 0;
				for (int k = si; k <= ei; k++) {
					sum = sum + arr[k];
				}

				System.out.println(sum);
			}

		}
	}

	public static void subarraySum2Loops(int[] arr) {

		for (int si = 0; si <= arr.length - 1; si++) {

			int sum = 0;

			for (int ei = si; ei <= arr.length - 1; ei++) {

				sum = sum + arr[ei];

				System.out.println(si + "," + ei + " : " + sum);
			}
		}
	}

	public static void maxSubarraySum2Loops(int[] arr) {

		int max = Integer.MIN_VALUE;

		for (int si = 0; si <= arr.length - 1; si++) {

			int sum = 0;

			for (int ei = si; ei <= arr.length - 1; ei++) {

				sum = sum + arr[ei];

				if (sum > max)
					max = sum;
			}
		}

		System.out.println(max);
	}

	public static void targetSumPair(int[] arr, int target) {

		// array sort
		Arrays.sort(arr);

		// logic ...
		int i = 0;
		int j = arr.length - 1;

		while (i < j) {

			if (arr[i] + arr[j] > target)
				j--;
			else if (arr[i] + arr[j] < target)
				i++;
			else {

				System.out.println(arr[i] + " " + arr[j]);
				i++;
				j--;

			}
		}

	}

	public static void targetSumTriplet(int[] arr, int target) {

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {

			int nt = target - arr[i] ;
			
			int j = i + 1;
			int k = arr.length - 1;

			while (j < k) {

				if (arr[j] + arr[k] > nt)
					k--;
				else if (arr[j] + arr[k] < nt)
					j++;
				else {
					System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
					j++;
					k--;
				}

			}

		}

	}
}
