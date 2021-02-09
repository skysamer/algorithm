package chap02;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	static void swap(int[] a, int x, int y) {
		int t=a[x];
		a[x]=a[y];
		a[y]=t;
	}
	
	static void reverse(int[] a) {
		for(int i=0; i<a.length/2; i++) {
			swap(a, i, a.length-1-i);
		}
	}
 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�迭 �ε��� ����: ");
		int num=sc.nextInt();
		
		int[] arr=new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("arr["+i+"]: ");
			arr[i]=sc.nextInt();
		}
		
		reverse(arr);
		System.out.println("��� ���� ����");
		System.out.println(Arrays.toString(arr));
		sc.close();

	}

}
