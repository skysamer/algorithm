package chap5;

import java.util.Scanner;

public class Q2 {
	
	static int gcd(int x, int y) {
		while(true) {
			if(y==0)
				return x;
			int tmp=x;
			x=y;
			y=tmp%y;
		}
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수 구하기");
		
		System.out.print("정수1 입력: ");
		int x=sc.nextInt();
		
		System.out.print("정수2 입력: ");
		int y=sc.nextInt();
		
		System.out.println("최대공약수는 "+gcd(x, y)+"입니다.");
		

	}

}
