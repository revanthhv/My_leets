package Arrays_pract;

public class MaxSubArray {
	
	public static int maxSub(int nums[]) {
		int maxSum = Integer.MIN_VALUE;
		int currSum =0;
		
		
		for(int i=0; i<nums.length;i++) {
			currSum+= nums[i];
			
			if(currSum > maxSum) {
				maxSum = currSum;
			}
			if(maxSum <0) {
				maxSum =0;
			}
		}
		System.out.println(maxSum);
		return maxSum;
	}

	
	
public static void main(String[] args) {
		
		int a[] = {5,4,-1,7,8};
		maxSub(a);

}
}
