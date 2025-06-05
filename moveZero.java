class Solution {
    public void moveZeroes(int[] nums) {
        int k = 0;
        int[] n = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                n[k] = nums[i];
                k++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = n[i];
        }

    }
}
