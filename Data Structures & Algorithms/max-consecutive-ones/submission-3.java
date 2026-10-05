class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_ones, temp;
        max_ones = temp = 0;
        boolean in = false;
        for (int i : nums) {
            if (i == 1) {
                if (in == false)
                    in = true;
                ++temp;
            } else if (i == 0 && in == true) {
                in = false;
                temp = 0;
            }
            if (max_ones < temp)
                max_ones = temp;
        }

        return max_ones;
    }
}