class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> exists = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int exists_target = target - nums[i];
            if(exists.containsKey(exists_target))
            {
                return new int[] {exists.get(exists_target), i};
            }
            exists.put(nums[i], i);
        }
        return new int[] {};

    }
}