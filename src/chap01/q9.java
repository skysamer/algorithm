package chap01;

public class q9 {
	static int sumof(int a, int b) {
		int sum=0;
		for(int i=a; i<=b; i++) {
			sum+=i;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumof(1, 10));

	}

}
