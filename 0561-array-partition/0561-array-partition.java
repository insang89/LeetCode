class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums); // 1, 2, 3, 4
        for(int i=0; i<nums.length; i=i+2) {
            sum += nums[i];
        };
        return sum;
    };
};