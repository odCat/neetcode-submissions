class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_ones, temp;
        max_ones = temp = 0;
        for (int i : nums) {
            if (i == 1) {
                ++temp;
                if (max_ones < temp)
                    max_ones = temp;
            } else {
                temp = 0;
            }
        }

        return max_ones;
    }
}