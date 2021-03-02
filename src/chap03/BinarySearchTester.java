package chap03;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num=sc.nextInt();
		int[] arr=new int[num];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("arr[0]: ");
		arr[0]=sc.nextInt();
		
		for(int i=1; i<num; i++) {
			do {
				System.out.print("arr["+i+"]: ");
				arr[i]=sc.nextInt();
			}while(arr[i-1]>arr[i]);
		}
		
		System.out.print("검색할 값: ");
		int key=sc.nextInt();
		
		int idx=Arrays.binarySearch(arr, key);   //(배열, 키값)
		
		if(idx<0)
			System.out.println("값이 없습니다. 삽입포인트는 "+(-(idx+1))+"입니다.");
		else
			System.out.println("찾으려는 값의 인덱스는 "+idx+"입니다.");
				

	}

}
