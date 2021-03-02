package chap04;

public class Q3 {
	private int max;
	private int ptrA;  
	private int ptrB;
	private int[] stk;
	
	public enum AorB{
		StackA, StackB
	};
	
	public Q3(int capacity) {
		ptrA=0;
		ptrB=capacity-1;
		max=capacity;
		try {
			stk=new int[max];
		}catch (OutOfMemoryError e) {
			max=0;
		}
	}
	
	// 예외처리 메서드
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException() {}
	}
	// ↑ 예외처리 메서드
	
	public int push(AorB ab, int x) throws OverflowIntStackException{  //스택에 데이터를 넣는 메서드
		if(ptrA>=max)
			throw new OverflowIntStackException();
		
		switch(ab) {
		case StackA:
			stk[ptrA++]=x;
			break;
		case StackB:
			stk[ptrB--]=x;
			break;
		}
		return x;
	}
	
	public int pop(AorB ab) throws EmptyIntStackException{      // 데이터를 꺼내는 메서드
		int x=0;
		
		switch(ab) {
		case StackA:
			if(ptrA<=0)
				throw new EmptyIntStackException();
			x= stk[--ptrA];
			break;
		case StackB:
			if(ptrB>=max-1)
				throw new EmptyIntStackException();
			x=stk[++ptrB];
			break;
		}
		return x;
	}
	
	public int peek(AorB ab) throws EmptyIntStackException{        //최상단에 위치한 데이터 확인
		int x=0;
		
		switch(ab) {
		case StackA:
			if(ptrA<=0)
				throw new EmptyIntStackException();
			x=stk[ptrA-1];
			break;
		case StackB:
			if(ptrB>=max-1)
				throw new EmptyIntStackException();
			x=stk[ptrB+1];
			break;
		}
		return x;
		
	}
	
	public int indexOf(AorB ab, int x) {
		switch(ab) {
		case StackA:
			for(int i=ptrA-1; i>=0; i--) {
				if(stk[i]==x)
					return i;
			}
			break;
		case StackB:
			for(int i=ptrB+1; i<max; i++) {
				if(stk[i]==x)
					return i;
			}
			break;
		}
		return -1;
	}
	
	public void clear(AorB ab) {
		switch(ab) {
		case StackA:
			ptrA=0;
			break;
		case StackB:
			ptrB=max-1;
			break;
		}
	}
	
	public int capacity() {
		return max;
	}
	
	public int size(AorB ab) {
		int x=0;
		
		switch(ab) {
		case StackA:
			x=ptrA;
			break;
		case StackB:
			x=max-ptrB-1;
			break;
		}
		return x;
	}
	
	public boolean isFull() {
		return ptrA>=ptrB+1;
	}
	
	public boolean isEmpty(AorB ab) {
		switch(ab) {
		case StackA:
			return ptrA<=0;
		case StackB:
			return ptrB>=max-1;
		}
		return true;
	}
	
	public void dump(AorB ab) {
		switch(ab) {
		case StackA:
			if(ptrA<=0)
				System.out.println("스택이 비어 있습니다.");
			else {
				for(int i=0; i<ptrA; i++) 
					System.out.print(stk[i]+" ");
				System.out.println();
			}
		case StackB:
			if(ptrB>=max-1)
				System.out.println("스택이 비어 있습니다.");
			else {
				for(int i=max-1; i>ptrB; i--) 
					System.out.print(stk[i]+" ");
				System.out.println();
			}
		}
	}
}
