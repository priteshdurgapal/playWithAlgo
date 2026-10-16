class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       int start = 0;
		int end = 0;
		
		int maxlength = 0;
		HashSet<Character> hs = new HashSet<>();
		
		while(end<s.length()) {
			if(hs.add(s.charAt(end))) {
				end++;
				maxlength=Math.max(maxlength,hs.size());
			}
			else {
				hs.remove(s.charAt(start));
				start++;
			}
		}
		
        return maxlength;
    }
}
