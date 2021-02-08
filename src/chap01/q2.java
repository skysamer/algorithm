package chap01;

public class q2 {
	static int min4(int a, int b, int c, int d) {
		int min=a;
		
		if(b<min) min=b;
		if(c<min) min=c;
		if(d<min) min=d;
		
		return min;
		
	}

	public static void main(String[] args) {
		System.out.println(min4(3214, 321421, 5353, 22));

	}

}
