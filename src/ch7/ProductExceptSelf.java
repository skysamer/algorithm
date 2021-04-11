package ch7;

public class ProductExceptSelf {
	
	public int[] productExceptSelf(int[] nums) {
        int left=1;
        int right=1;
        int[] ans=new int[nums.length];
        
        for(int i=0; i<nums.length; i++) {
        	ans[i]=left;
        	left*=nums[i];
        }
        for(int i=nums.length-1; i>=0; i--) {
        	ans[i]*=right;
        	right*=nums[i];
        }
        
        return ans;
    }

	public static void main(String[] args) {

	}

}
