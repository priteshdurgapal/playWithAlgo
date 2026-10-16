class Solution {
    public int trap(int[] height) {
        int res=0;
        int l=0;
        int r=height.length-1;
        int l_max=Integer.MIN_VALUE;
        int r_max=Integer.MIN_VALUE;
        while(l<r) {
            l_max=Math.max(l_max,height[l]);
            r_max = Math.max(r_max,height[r]);
            if(l_max<r_max) {
                res+= l_max-height[l];
                l++;
            } else {
                res+=r_max-height[r];
                r--;
            }
        }
        return res;

    }
}
