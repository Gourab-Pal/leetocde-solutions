class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
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
}