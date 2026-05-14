class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, 1);

        for(int i=0; i<n; i++) {

            for(int j = 0; j<n; j++) {

                if(i != j) {
                    result[i] *= nums[j];
                }
            }
        }
        return result;
    }
}  
