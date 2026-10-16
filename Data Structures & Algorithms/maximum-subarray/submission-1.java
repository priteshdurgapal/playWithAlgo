class Solution {
    public int maxSubArray(int[] nums) {
        int finalResult = nums[0];
        int interimResult = nums[0];
        for(int i=1;i<nums.length;i++) {
            interimResult = Math.max(interimResult+nums[i],nums[i]);
            finalResult = Math.max(finalResult,interimResult);
        }
        return finalResult;
    }
}
