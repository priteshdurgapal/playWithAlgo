class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

    //  int[] temps = {73, 74, 75, 71, 69, 72, 76, 73};

        int[] results = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<temperatures.length;i++) {

            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
                int prev = st.pop();
                results[prev] = i-prev;
            }
            st.push(i);
        }   

        return results;
    }
}
