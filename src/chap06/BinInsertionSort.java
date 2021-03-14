package chap06;

import java.util.Scanner;

public class BinInsertionSort {
	
	static void binInsertionSort(int[] a, int n) {
		for(int i=1; i<n; i++) {
			int key=a[i];
			
			int pl=0;  // 검색범위 맨 앞
			int pr=i-1; // 검색범위 맨 뒤
			int pc;     // 검색범위 중간
			int pd;     // 삽입하는 위치
			
			do {
				pc=(pl+pr)/2;
				if(a[pc]==key)
					break;
				else if(a[pc]<key)
					pl=pc+1;
				else
					pr=pc-1;
			}while(pl<=pr);
			pd=(pl<=pr) ? pc+1 : pr+1;
			
			for(int j=i; j>pd; j--) {
				a[j]=a[j-1];
			}
			a[pd]=key;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("이진 삽입 정렬");
		System.out.print("요솟수: ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("arr["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		
		binInsertionSort(arr, num);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"]: "+arr[i]);
		}
	}

}
