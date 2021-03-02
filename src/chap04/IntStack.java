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
	
	public int push(int x) throws OverflowIntStackException{  //스택에 데이터를 넣는 메서드
		if(ptr>=max)
			throw new OverflowIntStackException();
		
		return stk[ptr++]=x;
	}
	
	public int pop() throws EmptyIntStackException{      // 데이터를 꺼내는 메서드
		if(ptr<=0)
			throw new EmptyIntStackException();
		
		return stk[--ptr];
	}
	
	public int peek() throws EmptyIntStackException{        //최상단에 위치한 데이터 확인
		if(ptr<=0)
			throw new EmptyIntStackException();
		
		return stk[ptr-1];
	}
	
	public int indexOf(int x) {
		for(int i=ptr-1; i>=0; i--) {
			if(stk[i]==x)
				return i;
		}
		return -1;
	}
	
	public void clear() {
		ptr=0;
	}
	
	public int capacity() {
		return max;
	}
	
	public int size() {
		return ptr;
	}
	
	public boolean isFull() {
		return ptr>=max;
	}
	
	public boolean isEmpty() {
		return ptr<=0;
	}
	
	public void dump() {
		if(ptr<=0)
			System.out.println("스택이 비어 있습니다.");
		else {
			for(int i=0; i<ptr; i++) 
				System.out.print(stk[i]+" ");
			System.out.println();
		}
	}
}
