package chap01;

import java.util.Scanner;

public class q10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("a의 값: ");
		int a=sc.nextInt();
		System.out.print("b의 값: ");
		int b=sc.nextInt();
		while(b<=a) {
			System.out.println("a보다 큰 값 입력 요망.");
			System.out.print("b의 값: ");
			b=sc.nextInt();
		}
		int sub=b-a;
		
		System.out.println("b-a= "+sub);
		sc.close();

	}

}
