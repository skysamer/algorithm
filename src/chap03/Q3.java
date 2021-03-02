package chap03;

import java.util.Scanner;

public class Q3 {
	
	static int searchIdx(int[] a, int n, int key, int[] idx) {
		int count=0;
		
		for(int i=0; i<n; i++) {
			if(a[i]==key) {
				idx[count++]=i;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr1= {1, 9, 7, 9, 4, 6, 7, 9};
		int num=arr1.length;
		
		int[] arr2= new int[num];
		
		System.out.print("찾으려는 key값: ");
		int key=sc.nextInt();
		
		int ans=searchIdx(arr1, num, key, arr2);
		
		System.out.println("찾으려는 값의 개수는" +ans+"입니다.");
		

	}

}
