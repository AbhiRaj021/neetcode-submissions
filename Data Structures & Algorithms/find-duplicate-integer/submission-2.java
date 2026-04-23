class Solution {
    public int findDuplicate(int[] nums) {
        // Phase 1 find the intersection point in cycle


        int slow = 0;
        int fast = 0;

        while(true) {
            slow = nums[slow];        // 1 step
            fast = nums[nums[fast]];  // 2 step

            if(slow == fast) {
                break; // Intersection found
            }
        }

        // Phase 2 : Find the Entrace to the cycle(the duplicate)
        int slow2 = 0;

        while(true) {
            slow = nums[slow];
            slow2 = nums[slow2];

            if(slow == slow2) {
                return slow;  // this is duplicate integer;
            }
        }
    }
}
