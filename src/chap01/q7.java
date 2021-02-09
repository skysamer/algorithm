package chap01;

import java.util.Scanner;

public class q7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int n=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=n; i++) {
			sum+=i;
			System.out.print(i);
			if(i!=n)
				System.out.print("+");
		}
		System.out.println("= "+sum);

	}

}
