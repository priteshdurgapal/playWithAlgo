class Solution {

    public String encode(List<String> strs) {
        if(strs.size()==0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<strs.size();i++) {
            sb.append(strs.get(i));
            if(i<strs.size()-1) {
                sb.append("<>");
            }
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if(null==str) {
            return new ArrayList<String>();
        }
        List<String> result = new ArrayList<>();
        String[] decoded = str.split("\\<>");
        for(String s:decoded) {
            result.add(s);
        }
        return result;

    }
}
