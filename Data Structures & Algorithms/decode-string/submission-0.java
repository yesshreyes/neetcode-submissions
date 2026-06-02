class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder currStr = new StringBuilder();
        int currNum = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {
                currNum = currNum * 10 + (ch - '0');
            }

            else if (ch == '[') {
                countStack.push(currNum);
                stringStack.push(currStr);

                currNum = 0;
                currStr = new StringBuilder();
            }

            else if (ch == ']') {
                int repeat = countStack.pop();
                StringBuilder prevStr = stringStack.pop();

                for (int i = 0; i < repeat; i++) {
                    prevStr.append(currStr);
                }

                currStr = prevStr;
            }

            else { 
                currStr.append(ch);
            }
        }

        return currStr.toString();
    }
}
