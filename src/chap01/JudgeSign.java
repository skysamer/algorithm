package chap01;

import java.util.Scanner;

public class JudgeSign {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("���� �Է�: ");
		int n=sc.nextInt();
		
		if(n==1)
			System.out.println("n�� 1");
		else if(n==2)
			System.out.println("n�� 2");
		else if(n==3)
			System.out.println("n�� 3");

	}

}
