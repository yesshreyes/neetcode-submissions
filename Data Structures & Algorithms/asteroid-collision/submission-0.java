class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int ast : asteroids) {
            boolean alive = true;

            while (alive && ast < 0 && !stack.isEmpty() && stack.peek() > 0) {
                if (stack.peek() < -ast) {
                    stack.pop();              
                } else if (stack.peek() == -ast) {
                    stack.pop();              
                    alive = false;
                } else {
                    alive = false;           
                }
            }

            if (alive) {
                stack.push(ast);
            }
        }

        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
