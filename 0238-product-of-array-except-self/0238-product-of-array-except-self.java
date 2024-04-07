class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        // 왼쪽 곱셈
        int p = 1;
        for(int i=0; i<nums.length; i++) {
            result[i] = p;
            // 왼쪽 곱셈 결과
            p *= nums[i]; // 1*1=1 1*3=3 3*5=15 15*7=105
        };
        // 오른쪽 곱셈, 왼쪽 곱셈 결과에 차례대로 곱하기
        p = 1;
        for(int i=nums.length-1; i>=0; i--) {
            result[i] *= p;
            // 오른쪽 곱셈 결과
            p *= nums[i]; // 1*7=7 7*5=35 35*3=105 105*1=105
        };
        return result;
    };
};