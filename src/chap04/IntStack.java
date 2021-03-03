package chap04;

public class IntStack {
	private int max;
	private int ptr;  //쌓여있는 데이터 수
	private int[] stk;
	
	public IntStack(int capacity) {
		ptr=0;
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
	
	public int push(int x) throws OverflowIntStackException{  // 1)
		if(ptr>=max)
			throw new OverflowIntStackException();
		
		return stk[ptr++]=x;
	}
	
	public int pop() throws EmptyIntStackException{      // 2)
		if(ptr<=0)
			throw new EmptyIntStackException();
		
		return stk[--ptr];
	}
	
	public int peek() throws EmptyIntStackException{        // 3)
		if(ptr<=0)
			throw new EmptyIntStackException();
		
		return stk[ptr-1];
	}
	
	public int indexOf(int x) {    // 4)
		for(int i=ptr-1; i>=0; i--) {
			if(stk[i]==x)
				return i;
		}
		return -1;
	}
	
	public void clear() {      // 5)
		ptr=0;
	}
	
	public int capacity() {       // 6)
		return max;
	}
	
	public int size() {         // 7)
		return ptr;
	}
	
	public boolean isFull() {     // 8)
		return ptr>=max;
	}
	
	public boolean isEmpty() {     // 9)
		return ptr<=0;
	}
	
	public void dump() {      // 10)
		if(ptr<=0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for(int i=0; i<ptr; i++) 
				System.out.print(stk[i]+" ");
			System.out.println();
		}
	}
}
