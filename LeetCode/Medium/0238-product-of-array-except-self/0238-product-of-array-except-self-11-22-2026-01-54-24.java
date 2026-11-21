class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];

        prefix[0] = nums[0];
        suffix[nums.length - 1] = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i - 1] * nums[i];
        }

        for (int i = nums.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i];
        }


        int[] answer = new int[nums.length];
        answer[0] = suffix[1];
        answer[nums.length - 1] = prefix[nums.length - 2];
        for (int k = 1; k <= nums.length - 2; k++) {
            answer[k] = prefix[k - 1] * suffix[k + 1];
        }

        return answer;
    }
}