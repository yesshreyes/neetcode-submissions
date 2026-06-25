class Solution {
    public long minEnd(int n, int x) {
        long ans = x;
        long k = n - 1L;

        int bit = 0;

        while (k > 0) {
            if (((ans >> bit) & 1) == 0) {
                if ((k & 1) == 1) {
                    ans |= 1L << bit;
                }
                k >>= 1;
            }
            bit++;
        }

        return ans;
    }
}