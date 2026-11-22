class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++) {
            int current = nums[i];
            int diff = target - current;
            if(map.containsKey(diff)) {
                res[0] = i;
                res[1] = map.get(diff);
            } else {
                map.put(current, i);
            }
        }
        return res;
    }

    // 22 nov rev
}