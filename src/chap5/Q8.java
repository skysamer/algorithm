package chap5;

public class Q8 {
	static boolean[] flag_a=new boolean[8];  // 각 행에 퀸을 배치했는지 체크
	static boolean[] flag_b=new boolean[15]; // '/'대각선에 퀸을 배치했는지 체크
	static boolean[] flag_c=new boolean[15]; // '\'대각선에 퀸을 배치했는지 체크
	static int[] pos=new int[8];
	
	static void print() {
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				System.out.printf("%s", j==pos[i] ? "■" : "□");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void set(int i) {
		for(int j=0; j<8; j++) {
			if(flag_a[j]==false&&
					flag_b[i+j]==false&&
					flag_c[i-j+7]==false) {
				pos[i]=j;   // i열 j행에 배치
				if(i==7)  // 모든 열에 배치했다면
					print();
				else {
					flag_a[j]=flag_b[i+j]=flag_c[i-j+7]=true;
					set(i+1);
					flag_a[j]=flag_b[i+j]=flag_c[i-j+7]=false;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		set(0);
	}
}
