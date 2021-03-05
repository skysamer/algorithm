package chap5;

public class RecurX1 {
	
	static void recur(int n) {
		while(n>0) {
			recur(n-1);
			System.out.println(n);
		}
	}

	public static void main(String[] args) {

	}

}
