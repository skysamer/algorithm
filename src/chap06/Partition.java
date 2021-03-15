package chap06;

import java.util.Scanner;

public class Partition {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	
	static void partition(int[] a, int n) {
		int pl=0;
		int pr=n-1;
		int pivot=a[n/2];
		
		do {
			while(a[pl]<pivot) pl++;
			while(a[pr]>pivot) pr--;
			if(pl<=pr)
				swap(a, pl++,pr--);
		}while(pl<=pr);
		
		System.out.println("피벗의 값은 "+pivot+"입니다.");
		
		System.out.println("피벗 이하의 그룹");
		for(int i=0; i<=pl-1; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		if(pl>pr+1) {
			System.out.println("피벗과 일치하는 그룹");
			for(int i=pr+1; i<=pl-1; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		
		System.out.println("피벗 이상의 그룹");
		for(int i=pr+1; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("배열을 나눕니다.");
		System.out.print("요솟수: ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("arr["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		
		partition(arr, num);

	}

}
