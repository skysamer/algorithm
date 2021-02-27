package chap03;

import java.util.Scanner;

public class SeqSearchSen {
	
	static int seqSearchSen(int[] a, int n, int key) {
		int i=0;
		
		a[n]=key;       //보초 추가
		
		while(true) {
			if(a[i]==key)
				break;
			i++;
		}
		return i==n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int num=sc.nextInt();
		int[] arr=new int[num+1];
		
		for(int i=0;i<num; i++) {
			System.out.print("arr["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("검색할 값: ");
		int k=sc.nextInt();
		
		int idx=seqSearchSen(arr, num, k);
		
		if(idx==-1)
			System.out.println("해당요소가 배열에 없습니다.");
		else
			System.out.println(k+"은(는) x["+idx+"]에 있습니다.");

	}

}
