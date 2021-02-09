package chap01;

import java.util.Scanner;

public class q11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("양의 정수 입력: ");
		int a=sc.nextInt();
		
		int x=1;
		int i=0;
		
		while(true) {
			if(x<=a) {
				x*=10;
				i++;
			}
			else
				break;
		}
		System.out.println("a는 "+i+"자리");

	}

}
