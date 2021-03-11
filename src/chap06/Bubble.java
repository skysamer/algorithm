package chap06;

import java.util.Scanner;

public class Bubble {
	static void swap(int[] a, int idx1, int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	
	static void bubbleSort(int[] a, int num) {
		for(int i=num-1; i>0; i--) {
			for(int j=0; j<i; j++) {
				if(a[j]>a[j+1])
					swap(a, j, j+1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("버블 정렬(버전1)");
		System.out.print("요솟수: ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("arr["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		
		bubbleSort(arr, num);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"]: "+arr[i]);
		}
	}
}
