package chap02;

import java.util.Arrays;

public class q5 {
	
	static void rcopy(int[] a, int[] b) {
		for(int i=0; i<a.length; i++) {
			a[a.length-i-1]=b[i];
		}
	}

	public static void main(String[] args) {
		int[] a= {1, 2, 3, 4, 5};
		int[] b= {10, 20, 30, 40, 50};
		
		rcopy(a, b);
		System.out.println(Arrays.toString(a));

	}

}
