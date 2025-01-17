// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        if(nums == null || nums.length == 0) return new ArrayList<> ();
        
        List<Integer>result = new ArrayList<> ();
        int n = nums.length;
        for(int i = 0;i<n;i++)
        {
            int k = Math.abs(nums[i]) - 1;
            if(nums[k] > 0)
            {
                nums[k] = -nums[k];
            }
        }
        for(int i = 0;i<n;i++)
        {
            if(nums[i] > 0)
            {
                result.add(i+1);
            }
            else
            {
                nums[i] = -nums[i];
            }
        }
        return result;
    }
}