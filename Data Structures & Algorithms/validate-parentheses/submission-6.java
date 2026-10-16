class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        boolean valid = true;

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) { 
                    valid = false;
                    break;
                }
                char top = stack.peek();
                if ((c == '}' && top == '{') ||
                    (c == ']' && top == '[') ||
                    (c == ')' && top == '(')) {
                    stack.pop(); 
                } else {
                    valid = false;
                    break;
                }
            }
        }

        return valid && stack.isEmpty();
}
}
