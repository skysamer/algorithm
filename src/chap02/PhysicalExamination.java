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
				new PhyDate("������", 162, 0.3),
				new PhyDate("������", 173, 0.7),
				new PhyDate("������", 175, 2.0),
				new PhyDate("ȫ����", 171, 1.5),
				new PhyDate("�̼���", 168, 0.4),
				new PhyDate("�迵��", 174, 1.2),
				new PhyDate("�ڿ��", 169, 0.8),
		};
		
		int[] vdist=new int[VMAX];
		
		System.out.println("�� ��ü�˻� ����Ʈ ��");
		System.out.println("�̸�       Ű   �÷�");
		System.out.println("----------------------");
		for(int i=0; i<x.length; i++) {
			System.out.printf("%-8s%3d%5.1f%n", x[i].name, x[i].height, x[i].vision);
		}
		
		System.out.printf("%n��� Ű: %5.1fcm%n", aveHeight(x));
		
		distVision(x, vdist);
		
		System.out.println("%n�÷º���");
		for(int i=0; i<VMAX; i++) {
			System.out.printf("%3.1f: %2d��%n", i/10.0, vdist[i]);
		}
	}

}
