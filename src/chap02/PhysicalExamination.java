package chap02;

import java.util.Scanner;

public class PhysicalExamination {
	
	static final int VMAX=21;
	
	static class PhyDate{
		String name;
		int height;
		double vision;
		
		public PhyDate(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	static double aveHeight(PhyDate[] dat) {
		double sum=0;
		
		for(int i=0; i<dat.length; i++) {
			sum+=dat[i].height;
		}
		return sum/dat.length;
	}
	
	static void distVision(PhyDate[] dat, int[] dist) {
		int i=0; 
		
		dist[i]=0;
		
		for(i=0; i<dat.length; i++) {
			if(dat[i].vision>=0.0&&dat[i].vision<=VMAX/10.0)
				dist[(int)(dat[i].vision*10)]++;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		PhyDate[] x= {
				new PhyDate("박현규", 162, 0.3),
				new PhyDate("함진아", 173, 0.7),
				new PhyDate("최윤미", 175, 2.0),
				new PhyDate("홍연의", 171, 1.5),
				new PhyDate("이수진", 168, 0.4),
				new PhyDate("김영준", 174, 1.2),
				new PhyDate("박용규", 169, 0.8),
		};
		
		int[] vdist=new int[VMAX];
		
		System.out.println("■ 신체검사 리스트 ■");
		System.out.println("이름       키   시력");
		System.out.println("----------------------");
		for(int i=0; i<x.length; i++) {
			System.out.printf("%-8s%3d%5.1f%n", x[i].name, x[i].height, x[i].vision);
		}
		
		System.out.printf("%n평균 키: %5.1fcm%n", aveHeight(x));
		
		distVision(x, vdist);
		
		System.out.println("%n시력분포");
		for(int i=0; i<VMAX; i++) {
			System.out.printf("%3.1f: %2d명%n", i/10.0, vdist[i]);
		}
	}

}
