package chap01;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println("2자리의 정수 입력.");
		
		do {
			System.out.println("입력: ");
			num=sc.nextInt();
		}while(num<10||num>99);
		
		System.out.println("num: "+num);

	}

}
