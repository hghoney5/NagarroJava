package array;

public class Inverse {
	
	public static void main(String[] args) {
		int[] arr = {3, 0, 4, 1, 2};
		int[] inv = inverse(arr);
		arr = inv;
		display(arr);
	}
	
	public static void display(int[] arr)
    {
    	for(int i=0; i<arr.length; i++)
    		System.out.print(arr[i] + " ");
    	System.out.println();
    }
	
	public static int[] inverse(int[] arr)
	{
		int[] res = new int[arr.length];
		
		for(int i=0; i<arr.length; i++)
		{
			res[arr[i]] = i;
		}
		return res;
	}
}
