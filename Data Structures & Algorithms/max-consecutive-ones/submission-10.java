class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max, localMax;
        max = localMax = 0;
        for (int i : nums) {
            if (i == 1) {
                ++localMax;
                if (max < localMax)
                    max = localMax;
            } else {
                localMax = 0;
            }
        }

        return max;
    }
}