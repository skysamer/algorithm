package chap06;

import java.util.Scanner;

import chap04.IntStack;

public class QuickSort2 {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	
	static void quickSort(int[] a, int left, int right) {
		IntStack lstack=new IntStack(right-left+1);
		IntStack rstack=new IntStack(right-left+1);
		lstack.push(left);
		rstack.push(right);
		
		while(lstack.isEmpty()!=true) {
			int pl=left=lstack.pop();
			int pr=right=rstack.pop();
			int pivot=a[(left+right)/2];
			
			do {
				while(a[pl]<pivot) pl++;
				while(a[pr]>pivot) pr--;
				if(pl<=pr)
					swap(a, pl++,pr--);
			}while(pl<=pr);
			
			if(left<pr) {
				lstack.push(left);
				rstack.push(pr);
			}
			
			if(pl<right) {
				lstack.push(pl);
				rstack.push(right);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("퀵정렬");
		System.out.print("요솟수: ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("arr["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		
		quickSort(arr, 0, num-1);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<num; i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
		}
	}

}
