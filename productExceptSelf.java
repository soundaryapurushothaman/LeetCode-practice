class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] a = new int[nums.length];
        a[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            a[i] = a[i - 1] * nums[i - 1];
        }
        int product = 1;
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = a[i] * product;
            product *= nums[i];
        }
        return a;
    }
}
