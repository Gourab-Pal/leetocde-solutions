class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;

        for(int p=1; p<nums.length; p++) {
            if(nums[p] != nums[k]) {
                swap(p, k+1, nums);
                k++;
            }
        }

        return k+1;
    }

    public void swap(int p, int k, int[] nums) {
        int temp = nums[p];
        nums[p] = nums[k];
        nums[k] = temp;
    }
}