package strings;

import java.util.*;
import java.io.*;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome("nitin"));
	}
	
	public static boolean isPalindrome(String str) {
		String rev = new String("");
		for(int i=str.length()-1; i>0; i--)
			rev += str.charAt(i);
		if(str == rev)
			return true;
		return false;
	}

}
