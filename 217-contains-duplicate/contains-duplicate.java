class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> duplicate = new HashSet<>();

        for(int num : nums){
            if (!duplicate.add(num)) return true;
        }
        return false;
    }
}