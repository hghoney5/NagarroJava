package Test;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60};
		display(arr);
//		rotate(arr, 9);
//		display(arr);
		int rot = 4;
		rot = rot % arr.length;
		reverse(arr, 0, arr.length - rot -1);
		reverse(arr, arr.length - rot, arr.length-1);
		reverse(arr, 0, arr.length-1);
		display(arr);
		
	}
	
	public static void display(int[] arr)
	{
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void rotate(int[] arr, int rot)
	{
		rot = rot % arr.length;
		for(int i=0; i<rot; i++)
		{
			int temp = arr[arr.length-1];
			for(int j=arr.length-1; j>0; j--)
				arr[j] = arr[j-1];
			arr[0] = temp;
		}
	}
	
	public static void reverse(int[] arr, int start, int end)
	{
		for(int i=start; i<end/2; i++)
		{
			int temp = arr[i];
			arr[i] = arr[end-i];
			arr[end-i] = temp;
		}
	}
}
