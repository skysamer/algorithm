package chap01;

import java.util.Scanner;

public class SumForPos {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지 합을 구하기.");
		
		do {
			System.out.println("n의 값:");
			n=sc.nextInt();
		}while(n<=0);
		
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
