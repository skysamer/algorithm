package chap01;

import java.util.Arrays;

public class q16 {
	static void spira(int n) {
		for(int i=1; i<=n; i++) {
			int s=(i-1)*2+1;
			for(int j=0; j<n-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<s; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		spira(4);
		
		int[] a= {1, 2, 3, 4, 5};
		
		int[] b=a.clone();
		b[3]=0;
		
		System.out.println(Arrays.toString(b));

	}

}
