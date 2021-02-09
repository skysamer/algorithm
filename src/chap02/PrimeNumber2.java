package chap02;

public class PrimeNumber2 {

	public static void main(String[] args) {
		int count=0;
		int ptr=0;
		int[] prime=new int[500];
		
		prime[ptr++]=2;
		
		for(int n=3; n<=1000; n+=2) {
			int i;
			for(i=1; i<ptr; i++) {  //이미 찾은 소수로 나누기
				count++;
				if(n%prime[i]==0)
					break;
			}
			if(i==ptr)
				prime[ptr++]=n;
		}
		
		for(int i=0; i<ptr; i++) {
			System.out.println(prime[i]);
		}
		
		System.out.println("나눗셈 수행 횟수: "+count);

	}

}
