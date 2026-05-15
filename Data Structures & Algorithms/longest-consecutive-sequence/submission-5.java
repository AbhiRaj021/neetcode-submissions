class Solution {
    public int longestConsecutive(int[] nums) {
        
        int n = nums.length;
        if(n == 0) return 0;

        Arrays.sort(nums);
        int count = 1;
        int maxCount = 1;
        for(int i=0; i<n-1; i++) {

            if(nums[i] == nums[i+1]) {
                continue;  // handle duplicates by doing nothing
            }
            else if(nums[i] + 1 == nums[i+1]) {
                count++;
            } else {
                count = 1;  // reset count because sequence broke
            }
            maxCount = Math.max(maxCount, count); // this update each iteration
        }
        return maxCount;
    }
}
