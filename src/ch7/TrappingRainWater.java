package ch7;

public class TrappingRainWater {
	
	public static int trap(int[] height) {
		int ans=0;
		int start=0;
		int end=height.length-1;
		
		while(start<end) {
			
			if(height[start]<=height[end]) {
				int current=height[start];
				while(height[++start]<current) {
					ans+=current-height[start];
				}
			}
			
			else {
				int current=height[end];
				while(height[--end]<current) {
					ans+=current-height[end];
				}
			}
		}
		return ans;
    }
	
	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		System.out.println(trap(height));
	}

}
