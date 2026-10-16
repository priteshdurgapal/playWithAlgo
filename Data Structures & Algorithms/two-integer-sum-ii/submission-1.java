class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l=0;
        int r=numbers.length-1;
        int[] result=new int[2];
        for(int i=0;i<numbers.length;i++) {
            
            int sum=numbers[l]+numbers[r];
            if(sum==target) {
                 result[0]=l+1;
                 result[1]=r+1;
            }
            if(sum<target) {
                l++;
            }
             if(sum>target) {
                r--;
            }
        }

        return result;
    }


}
