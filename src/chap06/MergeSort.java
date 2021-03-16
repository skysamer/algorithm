package chap06;

import java.util.Scanner;

public class MergeSort {
	static int[] buff; // 작업용 배열
	
	static void __mergeSort(int[] a, int left, int right) {
		if(left<right) {
			int i;
			int center=(left+right)/2;
			int p=0;
			int j=0;
			int k=left;
			
			__mergeSort(a, left, center);      // 배열 앞부분 정렬
			__mergeSort(a, center+1, right);   // 배열 뒷부분 정렬
			
			for(i=left; i<=center; i++) {  // 배열의 앞부분을 buff에 복사
				buff[p++]=a[i];
			}
			
			while(i<=right && j<p) {
				a[k++]=(buff[j]<=a[i]) ? buff[j++] : a[i++];
			}
			
			while(j<p) {   // buff에 남아있는 요소 복사
				a[k++]=buff[j++];
			}
		}
	}
	
	static void mergeSort(int[] a, int n) {
		buff=new int[n];
		
		__mergeSort(a, 0, n-1);
		
		buff=null;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("병합 정렬");
		System.out.print("요솟수: ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("arr["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		
		mergeSort(arr, num);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"]: "+arr[i]);
		}
	}

}
