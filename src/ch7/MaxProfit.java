package ch7;

public class MaxProfit {
	
	public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int maxValue=0;
        
        for(int i=0; i<prices.length; i++) {
        	if(minPrice>prices[i]) {
        		minPrice=prices[i];
        	}
        	else if(prices[i]-minPrice>maxValue) {
        		maxValue=prices[i]-minPrice;
        	}
        }
        
        return maxValue;
    }

	public static void main(String[] args) {

	}

}
