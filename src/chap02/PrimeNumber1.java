package chap02;

public class PrimeNumber1 {

	public static void main(String[] args) {
		int count=0;
		
		
		//n은 나누어지는 수, i는 나누는 수
		for(int n=2; n<=1000; n++) {
			int i;
			for(i=2; i<n; i++) {
				count++;
				if(n%i==0)
					break;
			}
			if(n==i)
				System.out.println(n);
		}
		
		System.out.println("나눗셈 수행 횟수: "+count);

	}

}
