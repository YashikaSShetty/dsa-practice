//Kadanes Algorithm for finding largest Sum of Subaarray in an Array
class Solution{
    public int maxSubArray(int [] nums){
        int maxSum=0;
		int sumofArray=nums[0];
		for(int i=0;i<nums.length;i++){
			maxSum+=nums[i];
			sumofArray=Math.max(sumofArray,maxSum);
			if(maxSum<0){
				maxSum=0;
			}
		}
		return sumofArray;
    }
}