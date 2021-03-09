package chap5;

import java.util.Scanner;

public class Q6 {
	static String[] name= {"A기둥", "B기둥", "C기둥"};
	
	static void move(int no, int x, int y) {
		if(no>1)
			move(no-1, x, 6-x-y);
		
		System.out.println("원반["+no+"]을 "+name[x-1]+"에서 "+name[y-1]+"으로 옮김");
		
		if(no>1)
			move(no-1, 6-x-y, y);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("하노이의 탑");
		System.out.print("원반 개수: ");
		int n=sc.nextInt();
		
		move(n, 1, 3);
	}
}
