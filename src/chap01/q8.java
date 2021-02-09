package chap01;

import java.util.Scanner;

public class q8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int n=sc.nextInt();
		int sum=0;
		
		sum=(1+n)*(n/2);
		
		System.out.println(sum);
			

	}
}
