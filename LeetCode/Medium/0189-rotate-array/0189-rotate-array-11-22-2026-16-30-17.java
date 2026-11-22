
class Solution {
    public void rotate(int[] nums, int k) {

        int n = nums.length;
        k = k % n;

        int[] temp = new int[k];

        // Step 1: Store last k elements
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n - k + i];
        }

        // Step 2: Shift remaining elements right
        for (int j = n - k - 1; j >= 0; j--) {
            nums[j + k] = nums[j];
        }

        // Step 3: Copy stored elements to beginning
        for (int m = 0; m < k; m++) {
            nums[m] = temp[m];
        }
    }
}
