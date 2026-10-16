class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) {
            return false;
        }
        int[] charArr = new int[256];

        for(int i=0;i<s.length();i++) {
           charArr[s.charAt(i)]++;
           charArr[t.charAt(i)]--;

        }

        for(int i=0;i<256;i++) {
            if(charArr[i]!=0) {
                return false;
            }
        }
        return true;
    }
}
