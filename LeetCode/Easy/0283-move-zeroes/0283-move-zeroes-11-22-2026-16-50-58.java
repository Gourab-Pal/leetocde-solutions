class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int p2 = 0; // last index of non-zero value

        for(int p1=0; p1<n; p1++) {
            if(nums[p1] != 0) {
                swap(p1, p2, nums);
                p2++;
            }
        }
    }

    public void swap(int p1, int p2, int[] nums) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}