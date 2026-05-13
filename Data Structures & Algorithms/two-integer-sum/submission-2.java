class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] sum = new int[2];

        for(int i=0; i<n; i++) {

            for(int j=i+1; j<n; j++) {

                if(nums[i] + nums[j] == target) {
                    sum[0] = i;
                    sum[1] = j;
                }
            }
        }
        return sum;
    }
}
