package chap03;

import java.util.Scanner;

public class SeqSearchSen {
	
	static int seqSearchSen(int[] a, int n, int key) {
		int i=0;
		
		a[n]=key;       //���� �߰�
		
		while(true) {
			if(a[i]==key)
				break;
			i++;
		}
		return i==n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num=sc.nextInt();
		int[] arr=new int[num+1];
		
		for(int i=0;i<num; i++) {
			System.out.print("arr["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("�˻��� ��: ");
		int k=sc.nextInt();
		
		int idx=seqSearchSen(arr, num, k);
		
		if(idx==-1)
			System.out.println("�ش��Ұ� �迭�� �����ϴ�.");
		else
			System.out.println(k+"��(��) x["+idx+"]�� �ֽ��ϴ�.");

	}

}
