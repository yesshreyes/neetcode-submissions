class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 1;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int curr = 1;
                int x = num;

                while (set.contains(x + 1)) {
                    x++;
                    curr++;
                }

                max = Math.max(max, curr);
            }
        }
        return max;
    }
}
