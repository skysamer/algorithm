package chap04;


public class IntAryQueue {
	private int max;
	private int num;
	private int[] que;
	
	public IntAryQueue(int capacity) {
		num=0;
		max=capacity;
		que=new int[max];
	}
	
	// 예외처리 메서드
		public class EmptyIntQueueException extends RuntimeException{
			public EmptyIntQueueException() {}
		}
		
		public class OverflowIntQueueException extends RuntimeException{
			public OverflowIntQueueException() {}
		}
		// ↑ 예외처리 메서드
		
		public int enQueue(int x) throws OverflowIntQueueException{  // 1)
			if(num>=max)
				throw new OverflowIntQueueException();
			
			return que[num++]=x;
		}
		
		public int deQueue() throws EmptyIntQueueException{  // 2)
			if(num<=0)
				throw new EmptyIntQueueException();
			
			int x=que[0];
			for(int i=0; i<num-1; i++)
				que[i]=que[i+1];
			num--;
			
			return x;
		}
		
		public int peek() throws EmptyIntQueueException{        //최상단에 위치한 데이터 확인 3)
			if(num<=0)
				throw new EmptyIntQueueException();
			
			return que[num-1];
		}
		
		public int indexOf(int x) {            // 4)
			for(int i=0; i<num; i++) {
				if(que[i]==x)
					return i;
			}
			return -1;
		}
		
		public void clear() {    // 5)
			num=0;
		}
		
		public int capacity() {     // 6)
			return max;
		}
		
		public int size() {         // 7)
			return num;
		}
		
		public boolean isFull() {    // 8)
			return num>=max;
		}
		
		public boolean isEmpty() {    // 9)
			return num<=0;
		}
		
		public void dump() {       // 10)
			if(num<=0)
				System.out.println("큐가 비어 있습니다.");
			else {
				for(int i=0; i<num; i++) 
					System.out.print(que[i]+" ");
				System.out.println();
			}
		}
}
