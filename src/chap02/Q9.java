package chap02;

import java.util.Scanner;

public class Q9 {
	static int[][] mDays= {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	static int isLeap(int year) {
		return (year%4==0&&year%100!=0||year%400==0)?1:0;
	}
							
	static int dayOfYear(int y, int m, int d) {
		int days=d;
		
		for(int i=1; i<m; i++) {
			days+=mDays[isLeap(y)][i-1];
		}
		return 365+isLeap(y)-days;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int retry;
		
		System.out.println("그 해 남은 일수 구하기");
		
		do {
			System.out.print("년: "); int year=sc.nextInt();
			System.out.print("월: "); int month=sc.nextInt();
			System.out.print("일: "); int day=sc.nextInt();
			
			System.out.printf("그 해 남은 일수는 %d일 입니다.%n", dayOfYear(year,month,day));
			
			System.out.println("한 번 더 할까요? (1.예/2.아니오): ");
			retry=sc.nextInt();
		}while(retry==1);

	}

}
