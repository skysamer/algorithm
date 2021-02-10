package chap02;

import java.util.Scanner;

public class YMD{
	int y;
	int m;
	int d;
	
	public YMD(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	static int isLeap(int year) {
		return (year%4==0&&year%100!=0||year%400==0)?1:0;
	}
	
	static int[][] mDays= {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	
	YMD after(int n) {
		YMD ay=new YMD(this.y, this.m, this.d);
		
		ay.d+=n;
		while(ay.d>mDays[isLeap(y)][ay.m-1]) {
			ay.d-=mDays[isLeap(y)][ay.m-1];
			if(++ay.m>12) {
				ay.y++;
				ay.m=1;
			}
		}
		return ay;	
	}
	
	YMD before(int n) {
		YMD by=new YMD(this.y, this.m, this.d);
		
		by.d-=n;
		while(by.d<1) {
			if(--by.m<1) {
				by.y--;
				by.m=12;
			}
			by.d+=mDays[isLeap(y)][by.m-1];
		}
		return by;	
	}
	


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("날짜를 입력하세요.");
		
		System.out.print("년: "); int year=sc.nextInt();
		System.out.print("월: "); int month=sc.nextInt();
		System.out.print("일: "); int day=sc.nextInt();
		
		System.out.print("몇 일 뒤의 날짜를 구할까요?: ");
		int n=sc.nextInt();
		
		YMD date=new YMD(year, month, day);
		
		YMD y1=date.after(n);
		System.out.printf("%d일 후의 날짜는 %d년, %d월, %d일 입니다.%n", n, y1.y, y1.m, y1.d);
		
		YMD y2=date.before(n);
		System.out.printf("%d일 전의 날짜는 %d년, %d월, %d일 입니다.%n", n, y2.y, y2.m, y2.d);
		
	}

}