package chap04;

import java.util.Scanner;

public class IntStackTester {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		IntStack s=new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수: "+s.size()+" / "+s.capacity());
			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)찾기 (6)클리어 (7)비어있는가 (8)가득찼는가 (0)종료: ");
			
			int menu=sc.nextInt();
			if(menu==0)
				break;
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터: ");
				x=sc.nextInt();
				try {
					s.push(x);
				}catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
			case 2:
				try {
					x=s.pop();
					System.out.println("팝한 데이터는 "+x+"입니다.");
				}catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 3:
				try {
					x=s.peek();
					System.out.println("피크한 데이터는 "+x+"입니다.");
				}catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			case 4: 
				s.dump();
				break;
			case 5:
				System.out.print("찾고자 하는 데이터 입력: ");
				x=sc.nextInt();
				s.indexOf(x);
				System.out.println("데이터는 "+x+"인덱스에 존재합니다.");
				break;
			case 6:
				s.clear();
				System.out.println("스택이 비워졌습니다.");
				break;
			case 7:
				System.out.println(s.isEmpty());
				break;
			case 8:
				System.out.println(s.isFull());
				break;
			}
		}
	}
}
