class Solution {
    public String robotWithString(String s) {
        int n = s.length();
        char[] min = new char[n];
        min[n-1] = s.charAt(n-1);
        for (int i = n-2; i >= 0; i--) {
            min[i] = s.charAt(i) < min[i+1] ? s.charAt(i) : min[i+1];
        }
        
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            stack.add(c);
            if (i < n-1) {
                while (!stack.isEmpty() && stack.peek() <= min[i+1]) {
                    sb.append(stack.pop());
                }
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}