package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {
	
	static class PhyscDate{
		private String name;
		private int height;
		private double vision;
		
		public PhyscDate(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		public String toString() {
			return name+" "+height+" "+vision;
		}
		
		//오름차순으로 정렬하기 위한 comparator
		public static final Comparator<PhyscDate> HEIGHT_ORDER
		=new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscDate>{
			public int compare(PhyscDate d1, PhyscDate d2) {
				return (d1.height>d2.height) ? 1 : (d1.height<d2.height) ? -1 : 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		PhyscDate[] x= {
				new PhyscDate("이나령", 162, 0.3),
				new PhyscDate("유지훈", 168, 0.4),
				new PhyscDate("김한결", 169, 0.8),
				new PhyscDate("홍준기", 171, 1.5),
				new PhyscDate("전서현", 173, 0.7),
				new PhyscDate("이호연", 174, 1.2),
				new PhyscDate("이수민", 175, 2.0),
		};
		System.out.print("몇 센치인 사람을 찾고 있나요?: ");
		int height=sc.nextInt();
		int idx=Arrays.binarySearch(
				x,
				new PhyscDate("", height, 0.0),
				PhyscDate.HEIGHT_ORDER);
		
		if(idx<0)
			System.out.println("요소가 없습니다.");
		else {
			System.out.println("x["+idx+"]에 있습니다.");
			System.out.println("찾은 데이터: "+x[idx]);
		}
	}
}
