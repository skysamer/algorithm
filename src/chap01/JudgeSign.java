package chap01;

import java.util.Scanner;

public class JudgeSign {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수 입력: ");
		int n=sc.nextInt();
		
		if(n==1)
			System.out.println("n은 1");
		else if(n==2)
			System.out.println("n은 2");
		else if(n==3)
			System.out.println("n은 3");

	}

}
