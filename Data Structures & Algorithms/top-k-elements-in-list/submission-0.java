class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>(freq.keySet());

        list.sort((a, b) -> freq.get(a) - freq.get(b));

        int[] result = new int[k];
        int idx = 0;
        for (int i = list.size() - k; i < list.size(); i++) {
            result[idx++] = list.get(i);
        }

        return result;
    }
}