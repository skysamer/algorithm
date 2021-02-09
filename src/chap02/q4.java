package chap02;

import java.util.Arrays;

public class q4 {
	static void copy(int[] a, int[] b) {
		for(int i=0; i<b.length; i++) {
			a[i]=b[i];
		}
	}

	public static void main(String[] args) {
		int[] a= {1, 2, 3, 4, 5};
		int[] b= {10, 20, 30, 40, 50};
		
		copy(a, b);
		System.out.println(Arrays.toString(a));

	}

}
