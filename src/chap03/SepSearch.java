package chap03;

import java.util.Scanner;

public class SepSearch {
	
	static int seqSearch(int[] a, int n, int key) {
		int i=0;
		
		while(true) {
			if(i==n)
				return -1;
			if(a[i]==key)
				return i;
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("�˻��� ��: ");
		int k=sc.nextInt();
		
		int idx=seqSearch(arr, num, k);
		
		if(idx==-1)
			System.out.println("���� �迭�� �����ϴ�.");
		else
			System.out.println(k+"��(��) x["+idx+"]�� �����մϴ�.");

	}

}
