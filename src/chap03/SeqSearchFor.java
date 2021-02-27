package chap03;

import java.util.Scanner;

public class SeqSearchFor {
	static int seqSearch(int[] a, int n, int key) {
		for(int i=0; i<n; i++) {
			if(a[i]==key)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int k=sc.nextInt();
		
		int idx=seqSearch(arr, num, k);
		
		if(idx==-1)
			System.out.println("값이 배열에 없습니다.");
		else
			System.out.println(k+"은(는) x["+idx+"]에 존재합니다.");

	}

}
