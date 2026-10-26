class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> attempt = new HashSet<Integer>();
        boolean res=false;
        for(int c: nums) {
            if(!(attempt.contains(c))) {
                attempt.add(c);
            } else {
                res=true;
            }
        }
        return res;
    }
}