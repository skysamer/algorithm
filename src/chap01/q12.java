package chap01;

public class q12 {

	public static void main(String[] args) {
		
		System.out.print("   |");
		for(int i=1; i<=9; i++) {
			System.out.printf("%4d", i);
		}
		System.out.println();
		System.out.println("---+---------------------------------------------");
		for(int j=1; j<=9; j++) {
			System.out.printf("%2d", j);
			for(int i=1; i<=9; i++) {
				System.out.printf("%5d", i*j);
			}
			System.out.println();
		}
	}
}
