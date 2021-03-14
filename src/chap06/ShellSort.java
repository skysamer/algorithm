package chap06;

import java.util.Scanner;

public class ShellSort {
	
	static void shellSort(int[] a, int n) {
		for(int h=n/2; h>0; h/=2) {   // 배열을 그룹으로 나누는 로직
			for(int i=h; i<n; i++) { // 나눈 그룹을 하나씩 조정
				int j;
				int tmp=a[i];
				
				for(j=i-h; j>=0 && a[j]>tmp; j-=h) {  // 앞쪽 배열이 크면 교환
					a[j+h]=a[j];
				}
				a[j+h]=tmp;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("셸 정렬(버전 1)");
		System.out.print("요솟수: ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("arr["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		
		shellSort(arr, num);
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<num; i++) {
			System.out.println("arr["+i+"]: "+arr[i]);
		}
		
		sc.close();
	}

}
