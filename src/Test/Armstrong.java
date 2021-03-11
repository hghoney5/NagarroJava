package Test;

public class Armstrong {

	public static void main(String[] args) {
		
		printArmstrong(10, 1000);
	}
	
	public static void printArmstrong(int lo, int hi) {
		for(int i=lo; i<= hi; i++) {
			if(isArmstrong(i))
				System.out.println(i);
		}
	}
	
	public static boolean isArmstrong(int n)
	{
		int num = n;
		int nod = noOfDigits(n);
		int sum = 0;
		while(n != 0)
		{
			int rem = n%10;
			sum += (int) Math.pow(rem, nod);
			n /= 10;
		}
		if(sum == num)
			return true;
		return false;
	}
	
	public static int noOfDigits(int n) {
		int count = 0;
		while(n!=0)
		{
			count++;
			n /= 10;
		}
		return count;
	}

}
