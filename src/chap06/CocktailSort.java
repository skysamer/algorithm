package chap06;

import java.util.Scanner;

public class CocktailSort {
	static void swap(int[] a, int idx1, int idx2) {
		int t=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=t;
	}
	
	static void cocktailSort(int[] a, int n) {
		int cnt=1;
		int k=0;
		
		while(k<n-1) {
			int last=n-1;
			
			if(cnt%2==0) {
				for(int j=k; j<last; j++)
					if(a[j]>a[j+1]) {
						swap(a, j+1, j);
						last=j;
					}
				cnt++;
				k=last;
			}
			else {
				for(int j=n-1; j>k; j--)
					if(a[j-1]>a[j]) {
						swap(a, j-1, j);
						last=j;
					}
				cnt++;
				k=last;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("버블 정렬(최종)");
		System.out.print("요솟수: ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("arr["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		
		cocktailSort(arr, num);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<num; i++) {
			System.out.println("x["+i+"]: "+arr[i]);
		}
		sc.close();
	}

}
