class Solution {
    public boolean isValid(String s) {
        Stack<Character> stChar = new Stack<>();
        boolean result = true;

        for(Character c: s.toCharArray()) {
            if( c == '{' || c == '['  || c == '(' ) {
                stChar.push(c);
            } else {
                if(stChar.isEmpty()) {result=false; break;}
                char top = stChar.pop();
                if (c=='}' && top !='{' ||
                        c==']' && top!='['||
                        c==')' && top!='(' ) {

                    result=false;
                }
            }
        }
        return (result && stChar.isEmpty());
    }
}
