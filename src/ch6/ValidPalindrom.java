package ch6;

import java.util.Scanner;

public class ValidPalindrom {
	
	public static boolean isPalindrome(String s) {
		String str=new StringBuffer(s.toLowerCase().replaceAll("[^0-9a-z]", "")).toString(); 
		
		String reverse=new StringBuffer(str).reverse().toString();
		
		return str.equals(reverse);
		
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Input: ");
		String s=sc.nextLine();
		
		System.out.printf("Output: %b%n",isPalindrome(s));
		sc.close();
	}

}
