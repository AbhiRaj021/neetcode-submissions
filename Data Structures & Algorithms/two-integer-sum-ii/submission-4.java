class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // int[] sum = new int[2];

        // for (int i = 0; i < numbers.length; i++) {

        //     for (int j = i + 1; j < numbers.length; j++) {

        //         if (numbers[i] + numbers[j] == target) {
        //             sum[0] = i + 1;
        //             sum[1] = j + 1;
        //         }
        //     }
        // }
        // return sum;

        // Two Pointer Apporach

        int[] sum = new int[2];

        int l = 0, r = numbers.length-1;

        while(l < r) {

            int temp = numbers[l] + numbers[r];

            if(temp > target) {
                r--;

            } else if(temp < target) {
                l++;
            } else {
                return new int[] {l+1, r+1};
            }
        }
        return new int[] {};
    }
}
