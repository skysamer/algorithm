package ch6;

import java.util.Scanner;

public class ValidPalindromVer2 {
	
	public static boolean isPalindrome(String s) {
		char[] arr=s.toLowerCase().toCharArray();
		StringBuffer str=new StringBuffer();
		
		for(int i=0; i<arr.length; i++) {
			if((arr[i]>='0' && arr[i]<='9') || (arr[i]>='a' && arr[i]<='z'))
				str.append(arr[i]);
		}
		
		return (str.toString()).equals(str.reverse().toString());
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String s=sc.nextLine();
		
		System.out.printf("Output: %b%n",isPalindrome(s));
		sc.close();
	}

}
