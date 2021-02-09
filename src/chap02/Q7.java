package chap02;

import java.util.Scanner;

public class Q7 {
	static int cardConvR(int x, int r, char[] d) {
		int digit=0;
		String dchar="0123456789abcdefghijklmnopqrstuvwxyz";
		
		do {
			d[digit++]=dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		return digit; //자릿수 반환
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;  //변환하는 정수
		int cd;  // 기수
		int dno; // 변환 후에 자릿수
		int retry; // 다시한번
		char[] cno=new char[32];  //각 자리의 숫자를 넣어두는 배열
		
		System.out.println("10진수를 기수 변환.");
		
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수: ");
				no=sc.nextInt();
			}while(no<0);
			
			do {
				System.out.println("어떤 진수로 변환?> ");
				cd=sc.nextInt();
			}while(cd<2||cd>36);
			
			dno=cardConvR(no, cd, cno);
			
			System.out.print(cd+"진수로는 ");
			for(int i=dno-1; i>=0; i--)
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.print("한 번 더 할까요?(1.예/2.아니오): ");
			retry=sc.nextInt();
		}while(retry==1);

	}

}
