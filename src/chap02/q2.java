package chap02;

import java.util.Scanner;

public class q2 {
	static void swap(int[] a, int x, int y) {
		int t=a[x];
		a[x]=a[y];
		a[y]=t;
	}
	
	static void print(int[] a) {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	static void reverse(int[] a) {
		print(a);
		for(int i=0; i<a.length/2; i++) {
			System.out.printf("a[%d]�� a[%d]�� ��ȯ�մϴ�.%n", i, a.length-1-i);
			swap(a, i, a.length-1-i);
			print(a);
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
		System.out.println("���� ������ ���ƽ��ϴ�.");
		sc.close();

	}

}
