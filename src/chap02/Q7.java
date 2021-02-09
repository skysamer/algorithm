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
		return digit; //�ڸ��� ��ȯ
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int no;  //��ȯ�ϴ� ����
		int cd;  // ���
		int dno; // ��ȯ �Ŀ� �ڸ���
		int retry; // �ٽ��ѹ�
		char[] cno=new char[32];  //�� �ڸ��� ���ڸ� �־�δ� �迭
		
		System.out.println("10������ ��� ��ȯ.");
		
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ����: ");
				no=sc.nextInt();
			}while(no<0);
			
			do {
				System.out.println("� ������ ��ȯ?> ");
				cd=sc.nextInt();
			}while(cd<2||cd>36);
			
			dno=cardConvR(no, cd, cno);
			
			System.out.print(cd+"�����δ� ");
			for(int i=dno-1; i>=0; i--)
				System.out.print(cno[i]);
			System.out.println("�Դϴ�.");
			
			System.out.print("�� �� �� �ұ��?(1.��/2.�ƴϿ�): ");
			retry=sc.nextInt();
		}while(retry==1);

	}

}
