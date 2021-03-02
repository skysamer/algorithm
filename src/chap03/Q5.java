package chap03;

import java.util.Scanner;

public class Q5 {
	
	static int binSearchX(int[] a, int n, int key) {
		int pl=0;
		int pr=n-1;
		
		do {
			int pc=(pl+pr)/2;
			if(a[pc]==key) {
				for( ; ; pc--) {
					if(a[pc-1]<a[pc])
						break;
				}
				return pc;
			}
			else if(a[pc]<key)
				pl=pc+1;
			else
				pr=pc-1;
		}while(pl<=pr);
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int[] arr= {1, 3, 5, 7, 7, 7, 7, 8, 8, 9, 9};
		int num=arr.length;
		
		System.out.print("찾고자 하는 값: ");
		int key=sc.nextInt();
		
		int idx=binSearchX(arr, num, key);
		
		System.out.println(key+"은(는) "+idx+"에 있습니다.");

	}

}
