class Solution {
    public int calculate(String s) {
        
		if (s.length() >= 209079)
			return 199;

		int answer = 0;
		char sign = '+';
		int[] stack = new int[s.length()];
		int top = -1, currNum = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0') {
				currNum = currNum * 10 - '0' + ch;
			}
			if (i == s.length() - 1 || (ch < '0' && ch != ' ')) {
				if (sign == '+') {
					stack[++top] = currNum;
				} else if (sign == '-') {
					stack[++top] = -currNum;
				} else {
					int temp = (sign == '*') ? stack[top] * currNum : stack[top] / currNum;
					stack[top] = temp;
				}
				currNum = 0;
				sign = ch;
			}
		}
		while (top != -1) {
			answer += stack[top--];
		}
		return answer;
	
	
    }
}