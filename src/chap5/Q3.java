package chap5;

public class Q3 {
	
	static int gcd(int x, int y) {
		while(true) {
			if(y==0)
				return x;
			int tmp=x;
			x=y;
			y=tmp%y;
		}
	}
	
	static int gcdArray(int[] a, int start, int num) {
		
		if(num==1)
			return a[start];
		else if(num==2)
			return gcd(a[start], a[start+1]);
		else
			return gcd(a[start], gcdArray(a, start+1, num-1));
		
	}
	
	public static void main(String[] args) {
		
		int[] arr= {4, 8, 22};
		
		int ans=gcdArray(arr, 0, arr.length);
		
		System.out.println("배열의 최대공약수: "+ans);
		
	}

}
